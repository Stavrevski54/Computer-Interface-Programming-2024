public class Exercise2 {
    public static void main(String[] args) {
        Thread clock1 = new Thread(new TickTack("Seiko", 600));
        Thread clock2 = new Thread(new TickTack("Rolex", 800));
        clock1.start();
        clock2.start();
    }

    static class TickTack implements Runnable {
        private String name;
        private int rate;

        public TickTack(String name, int rate) {
            this.name = name;
            this.rate = rate;
        }

        @Override
        public void run() {
            while (true) {
                System.out.println(name + ": Tick");
                sleep();
                System.out.println(name + ": Tack");
                sleep();
            }
        }

        private void sleep() {
            try {
                Thread.sleep(rate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
