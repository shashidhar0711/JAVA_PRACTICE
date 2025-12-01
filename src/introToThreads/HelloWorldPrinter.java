package introToThreads;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Printing hello world printer class");
    }
}
