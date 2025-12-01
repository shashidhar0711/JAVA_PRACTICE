package introToThreads;

import java.util.concurrent.Callable;

public class CalculateCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Running in thread: "+ Thread.currentThread().getName());
        return 10+20;
    }
}
