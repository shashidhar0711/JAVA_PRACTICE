package Exceptions;

public class DivNumber {

    public int doSomething(int a, int b) throws NumberNotAllowed {
//        return a/b;
        if (b==0) {
            throw new NumberNotAllowed();
        }
        return a/b;
    }


    public void findRollNumber(int i) throws ClassNotFoundException, NumberNotAllowed {
        if (i < 0) {
            throw new ClassNotFoundException();
        }

        if (i % 2 == 0) {
            throw new NumberNotAllowed();
        }
    }
}
