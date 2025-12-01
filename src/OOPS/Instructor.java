package OOPS;

public class Instructor {
    int id;

    Instructor(int id) {
        this.id = id;
    }

    Instructor(Instructor oldIns) {
        this.id = oldIns.id;
    }
}
