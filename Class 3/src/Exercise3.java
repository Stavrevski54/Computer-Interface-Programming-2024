public class Exercise3 {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Exercise3 exercise3 = new Exercise3();

        Thread incrementerThread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    exercise3.increment();
                }
            }
        }, "Incrementer Thread 1");

        Thread incrementerThread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    exercise3.increment();
                }
            }
        }, "Incrementer Thread 2");

        incrementerThread1.start();
        incrementerThread2.start();

        incrementerThread1.join();
        incrementerThread2.join();

        System.out.println("Final count is: " + exercise3.count);
    }
}
