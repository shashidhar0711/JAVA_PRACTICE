package AdderAndSubtractorSynchronized;

public class Value {
    public int val = 0;

    synchronized public void increment(int i) {
        this.val +=1;
    }

    synchronized public void decrement(int i) {
        this.val -=1;
    }
}
