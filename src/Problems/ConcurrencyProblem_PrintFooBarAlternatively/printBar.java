package Problems.ConcurrencyProblem_PrintFooBarAlternatively;

public class printBar implements Runnable {
    @Override
    public void run() {
        System.out.print("bar");
    }
}
