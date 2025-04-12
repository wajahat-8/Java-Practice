package threads;

class MultiThreadingExample implements Runnable {
    private int threadNumber;

    public MultiThreadingExample(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From thread " + threadNumber + ": " + i);
            if (threadNumber == 3 && i == 3) {
                // Simulate a RuntimeException for thread 3 at iteration 3
                throw new RuntimeException("Exception in thread " + threadNumber);
            }
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadNumber + " was interrupted!");
            }
        }
    }
}

public class MultiThrading {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            MultiThreadingExample myThing = new MultiThreadingExample(i);
            threads[i] = new Thread(myThing);
            threads[i].start();

            // Immediately check if the thread is alive
            if (threads[i].isAlive()) {
                System.out.println("Thread " + i + " is alive after starting.");
            }
        }

        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join(); // Wait for the thread to complete
                if (!threads[i].isAlive()) {
                    System.out.println("Thread " + i + " has finished execution.");
                }
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted while waiting for thread " + i);
            } catch (RuntimeException e) {
                System.out.println("Caught RuntimeException in thread " + i + ": " + e.getMessage());
            }
        }

        System.out.println("All threads have completed execution.");
    }
}
