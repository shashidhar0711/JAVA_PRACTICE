package ProducerAndConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    public Store store;
    public Semaphore producerSema, consumerSema;

    Producer(Store store, Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }

    @Override
    public void run() {
        while(true) {
//            synchronized (store) {
//                if(store.getItems().size() < store.getMaxShelf()) {
            try {
                this.producerSema.acquire();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItems();
            this.consumerSema.release();
//                }
//            }
        }
    }
}
