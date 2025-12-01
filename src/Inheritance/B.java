package Inheritance;

import java.util.SequencedSet;

public class B extends A implements Runnable {

    B(String data) {
        System.out.println("Printing B");
        System.out.println(data);
    }

    @Override
    public void eat() {
        System.out.println("B class eats");
    }
}
