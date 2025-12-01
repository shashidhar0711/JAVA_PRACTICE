package AdderAndSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        System.out.println(v.val);

        Adder adder = new Adder(v);
        Substractor substractor = new Substractor(v);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addFuture = es.submit(adder);
        Future<Void> subFuture = es.submit(substractor);

        addFuture.get();
        subFuture.get();

        System.out.println(v.val);

    }
}
