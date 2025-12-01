package ProducerAndConsumer;

import javax.lang.model.type.MirroredTypeException;

public class Consumer implements Runnable{

    public Store store;

    Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if(store.getItems().size() > 0) {
                    store.removeItems();
                }
            }
        }
    }
}
