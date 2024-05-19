package lr6;

public class Example6 {
    private static int totalSum = 0;
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array);
        System.out.println("Сумма элементов в массиве: " + sum);
    }
    public static int calculateSum(int[] array) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[numThreads];
        int chunkSize = array.length / numThreads;

        for (int i = 0; i < numThreads; i++) {
            final int startIndex = i * chunkSize;
            final int endIndex = (i == numThreads - 1) ? array.length : (i + 1) * chunkSize;
            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = startIndex; j < endIndex; j++) {
                    localSum += array[j];
                }
                synchronized (Example6.class) {
                    totalSum += localSum;
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
        return totalSum;
    }


}
