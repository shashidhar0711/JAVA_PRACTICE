package Problems.ConcurrencyProblem_PrintInOrder;

public class printSecond implements Runnable{

    @Override
    public void run() {
        System.out.print("Second");
    }
}
