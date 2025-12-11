package Problems.ConcurrencyProblem_PrintFooBarAlternatively;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        FooBar fooBar = new FooBar(2);
        ExecutorService es = Executors.newCachedThreadPool();

        printBar print_Bar = new printBar();
        printFoo print_Foo = new printFoo();

        Runnable printFooTask = () -> {
            try {
                fooBar.foo(print_Foo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable printBarTask = () -> {
            try {
                fooBar.bar(print_Bar);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        es.submit(printFooTask);
        es.submit(printBarTask);


    }
}
