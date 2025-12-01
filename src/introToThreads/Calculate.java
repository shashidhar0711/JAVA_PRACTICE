package introToThreads;

public class Calculate implements Runnable {
    int val;

    Calculate(int val) {
        this.val = val;
    }

    @Override
    public void run() {
        System.out.println("Threads are: "+Thread.currentThread().getName());
    }
}
