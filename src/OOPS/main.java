package OOPS;

public class main {
    static void main(String[] args) {
//        Student s = new Student();
//        s.name = "shashi";
//        s.psp = 12.00;
//        s.setAge(12);
//
//        System.out.println(s.getAge());
        // Copy constructor
        Student s = new Student("Shashidhar", 807311,22, 10.00);
        Student s1 = new Student(s);
        s1.ins.id = 55;
        s.name = "A";
        System.out.println("DEBUG");

        System.out.println(s.name+ " "+s1.name);
    }
}
