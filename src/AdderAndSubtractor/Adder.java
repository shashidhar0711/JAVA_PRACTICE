package AdderAndSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    public Value value;

    Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() {
        for(int i = 0; i < 100000; i++) {
            this.value.val +=1;
        }
        return null;
    }
}
