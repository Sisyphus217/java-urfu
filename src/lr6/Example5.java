package lr6;

public class Example5 {
    private static int globalMax = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] array = {15, 22, 35, 47, 58, 61, 72, 83, 94, 105, 116, 127, 138, 149, 150, 161, 172, 183, 194, 200, 250, 300};
        int max = findMax(array);
        System.out.println("Максимальный элемент в массиве: " + max);
    }
    public static int findMax(int[] array) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[numThreads];
        int chunkSize = array.length / numThreads;

        for (int i = 0; i < numThreads; i++) {
            final int startIndex = i * chunkSize;
            final int endIndex = (i == numThreads - 1) ? array.length : (i + 1) * chunkSize;
            threads[i] = new Thread(() -> {
                int localMax = Integer.MIN_VALUE;
                for (int j = startIndex; j < endIndex; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }
                synchronized (Example5.class) {
                    if (localMax > globalMax) {
                        globalMax = localMax;
                    }
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return globalMax;
    }


}
