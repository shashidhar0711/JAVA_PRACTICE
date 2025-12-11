package Problems.ConcurrencyProblem_PrintFooBarAlternatively;

import java.util.concurrent.Semaphore;

public class FooBar {

    private int n;
    Semaphore printFooSema, printBarSema;
    public FooBar(int n) {
        this.n = n;
        printBarSema = new Semaphore(0);
        printFooSema = new Semaphore(1);
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            printFooSema.acquire();
            printFoo.run();
            printBarSema.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            printBarSema.acquire();
            printBar.run();
            printFooSema.release();
        }
    }
}
