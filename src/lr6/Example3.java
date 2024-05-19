package lr6;

public class Example3 {
    private static final Object monitor = new Object();
    private static int counter = 0;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            synchronized (monitor) {
                while (counter < 10) {
                    if (counter % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + counter);
                        counter++;
                        monitor.notifyAll();
                    } else {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "EvenThread");

        Thread oddThread = new Thread(() -> {
            synchronized (monitor) {
                while (counter < 10) {
                    if (counter % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + counter);
                        counter++;
                        monitor.notifyAll();
                    } else {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "OddThread");

        evenThread.start();
        oddThread.start();
    }
}
