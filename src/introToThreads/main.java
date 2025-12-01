package introToThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    static <Executorservice> void main(String[] args) {
        HelloWorldPrinter h = new HelloWorldPrinter();
        Thread t = new Thread(h);
        t.start();
        System.out.println("Thread are: "+Thread.currentThread().getName());

//        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i <=10000; i++) {
            Runnable c = new Calculate(i);
            es.execute(c);
//            Thread t2 = new Thread(c); # Runnable
//            t2.start();
        }

    }
}
