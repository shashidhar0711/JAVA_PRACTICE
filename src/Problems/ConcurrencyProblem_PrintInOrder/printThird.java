package Problems.ConcurrencyProblem_PrintInOrder;

public class printThird implements Runnable{

    @Override
    public void run() {
        System.out.print("Third");
    }
}
