package Problems.ConcurrencyProblem_PrintInOrder;

public class printFirst implements Runnable {
    @Override
    public void run() {
        System.out.print("First");
    }
}
