package Problems.ConcurrencyProblem_PrintFooBarAlternatively;

public class printFoo implements Runnable{
    @Override
    public void run() {
        System.out.print("foo");
    }
}
