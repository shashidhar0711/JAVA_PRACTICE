package AdderAndSubtractorMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock l = new ReentrantLock();
        System.out.println(v.val);

        Adder adder = new Adder(v, l);
        Substractor substractor = new Substractor(v, l);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addFuture = es.submit(adder);
        Future<Void> subFuture = es.submit(substractor);

        addFuture.get();
        subFuture.get();

        System.out.println(v.val);

    }
}
