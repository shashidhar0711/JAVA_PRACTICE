package Problems.ConcurrencyProblem_PrintInOrder;

import java.util.concurrent.Semaphore;

public class Foo {
    Semaphore secondSema, thirdSema;

    public Foo() {
        secondSema = new Semaphore(0);
        thirdSema = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        secondSema.release();
    }

    public void Second(Runnable printSecond) throws InterruptedException {
        secondSema.acquire();
        printSecond.run();
        thirdSema.release();
    }

    public void Third(Runnable printThird) throws InterruptedException {
        thirdSema.acquire();
        printThird.run();
        thirdSema.release();
    }



}
