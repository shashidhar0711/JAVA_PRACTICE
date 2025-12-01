package AdderAndSubtractorSynchronized;

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
//            synchronized (value) {
//                System.out.println("Lock acquired by subtractor "+i);
//                this.value.val -=1;
//            }
//            l.unlock();
            this.value.decrement(1);
        }
        return null;
    }
}
