package ProducerAndConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    public int maxShelf;
    private ConcurrentLinkedDeque<Object> items;

    Store(int maxShelf) {
        this.maxShelf = maxShelf;
        items = new ConcurrentLinkedDeque<>();
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public int getMaxShelf() {
        return maxShelf;
    }

    public void addItems() {
        System.out.println("Producer size is:"+ this.items.size());
        this.items.add(new Object());
    }

    public void removeItems() {
        System.out.println("Consumer size is:"+ this.items.size());
//        this.items.remove(this.items.size()-1);
        this.items.remove();
    }

}
