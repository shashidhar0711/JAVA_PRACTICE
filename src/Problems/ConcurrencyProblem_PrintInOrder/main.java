package Problems.ConcurrencyProblem_PrintInOrder;

import ProducerAndConsumerSemaphore.Producer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        ExecutorService es = Executors.newCachedThreadPool();


//        Runnable printFirstTask = new printFirst();
//        es.submit(foo.first(printFirstTask));
        Runnable firstTask = () -> {
            try {
                foo.first(new printFirst());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable secondTask = () -> {
            try {
                foo.Second(new printSecond());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable thirdTask = () -> {
            try {
                foo.Third(new printThird());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        es.submit(secondTask);
        es.submit(thirdTask);
        es.submit(firstTask);



    }
}
