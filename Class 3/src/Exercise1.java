public class Exercise1 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("Exercise Group");
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(group, "Thread " + (i + 1)) {
                public void run() {
                    try {
                        // Make the thread sleep for a while to prevent it from terminating immediately
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.setPriority(i + 1);
            thread.start();
            printThreadDetails(thread);
            if (thread.isAlive()) {
                System.out.println(thread.getName() + " is alive.");
            }
            thread.setPriority(thread.getPriority() + 1);
            System.out.println("Priority of " + thread.getName() + " increased to " + thread.getPriority());
        }
    }

    public static void printThreadDetails(Thread thread) {
        System.out.println("Name: " + thread.getName());
        System.out.println("Priority: " + thread.getPriority());
        System.out.println("Thread Group: " + thread.getThreadGroup().getName());
    }
}
