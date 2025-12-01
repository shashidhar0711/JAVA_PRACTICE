package Inheritance;

public class C extends B {
    String name;
    int id;


    C() {
        super("water");
        System.out.println("Printing C");
    }

    void doSomething(String abc) {
        System.out.println("Something: "+abc);
    }

    void doSomething(int b) {
        System.out.println("Something: "+b);
    }

    void doSomething(String abc, int a) {
        System.out.println("Something: "+abc + a);
    }

    void doSomething(int a, String abc) {
        System.out.println("Something: "+a + abc);
    }


}
