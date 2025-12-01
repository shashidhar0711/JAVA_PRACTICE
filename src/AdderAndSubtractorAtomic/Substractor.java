package AdderAndSubtractorAtomic;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substractor implements Callable<Void> {

    public Value value;
    public Lock l;

    Substractor(Value value, Lock l) {
        this.value = value;
        this.l = l;
    }


    @Override
    public Void call(){
        for (int i = 0; i < 100000; i++){
//            l.lock();
            System.out.println("Lock acquired by subtractor "+i);
            this.value.atomicInteger.addAndGet(-1);
//            l.unlock();
        }
        return null;
    }
}
