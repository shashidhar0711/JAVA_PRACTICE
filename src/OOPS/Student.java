package OOPS;

public class Student {
    public String name;
    int phoneNumber;
    private int age;
    protected double psp;
    String batchName = "A";
    Instructor ins;

    Student(String name, int phoneNumber, int age, double psp) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.psp = psp;
        this.ins = new Instructor(1);
    }

    Student(Student oldStudent) {
        this.name = new String(oldStudent.name);
        this.phoneNumber = oldStudent.phoneNumber;
        this.age = oldStudent.age;
        this.psp = oldStudent.psp;
        this.ins = new Instructor(oldStudent.ins);
        this.batchName = oldStudent.batchName;
//        this.ins = oldStudent.ins;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }
}
