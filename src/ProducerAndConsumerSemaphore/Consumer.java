package ProducerAndConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    public Store store;
    public Semaphore producerSema, consumerSema;

    Consumer(Store store, Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }

    @Override
    public void run() {
        while(true) {
//            synchronized (store) {
//                if(store.getItems().size() > 0) {
            try {
                this.consumerSema.acquire();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItems();
            this.producerSema.release();
//                }
//            }
        }
    }
}
