package Generics;

import java.util.List;

public class Pair <T, S,Q> {
    public T x;
    public S y;
    public Q Student;


    public S getY() {
        return y;
    }

    public T getX() {
        return x;
    }

    public Q getStudent() {
        return Student;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(S y) {
        this.y = y;
    }

    public void setZ(Q Student ) {
        this.Student = Student;
    }

    public  <M, N> void addition(M q, N r) {
        System.out.println("Value is: "+q+" "+r);
    }

    public  <M> void printArray(M[] arr) {
        for (M m: arr) {
            System.out.println(m);
        }
    }

    public <N extends Student> void printList(List<N> list) {
        for (N n: list) {
            System.out.println(n.name);
        }
    }
}
