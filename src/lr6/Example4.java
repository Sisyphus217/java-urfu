package lr6;

public class Example4 {
    private static int counter = 1;
    private static final Object monitor = new Object();

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(() -> {
                synchronized (monitor) {
                    System.out.println("Поток: " + counter);
                    counter++;
                }
            });

            thread.start();
        }
    }
}
