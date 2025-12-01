package Inheritance;

public class main {
    static void main(String[] args) {
        C c = new C();
        c.doSomething("abc");
        c.doSomething("abc", 10);
        c.doSomething(20, "edf");

        // Method overloading
        c.doSomething("abc");
        c.doSomething("abc", 10);
        c.doSomething(20, "edf");

        // method overidding
        B b = new B("Data");
        b.eat();

    }
}
