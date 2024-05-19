package lr6;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable printNumbers = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(printNumbers);
        thread.start();
        thread.join();
    }
}
