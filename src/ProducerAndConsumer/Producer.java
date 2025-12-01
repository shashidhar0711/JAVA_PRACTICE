package ProducerAndConsumer;

public class Producer implements Runnable{

    public Store store;

    Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if(store.getItems().size() < store.getMaxShelf()) {
                    store.addItems();
                }
            }
        }
    }
}
