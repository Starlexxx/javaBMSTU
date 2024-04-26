package lab8;

public class Robot {
    private final Object monitor = new Object();
    private boolean leftTurn = true;

    class LeftLeg extends Thread {
        public void run() {
            while (true) {
                synchronized (monitor) {
                    while (!leftTurn) {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("LEFT");
                    leftTurn = false;
                    monitor.notifyAll();
                }
            }
        }
    }

    class RightLeg extends Thread {
        public void run() {
            while (true) {
                synchronized (monitor) {
                    while (leftTurn) {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("RIGHT");
                    leftTurn = true;
                    monitor.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        LeftLeg leftLeg = robot.new LeftLeg();
        RightLeg rightLeg = robot.new RightLeg();
        leftLeg.start();
        rightLeg.start();
    }
}
