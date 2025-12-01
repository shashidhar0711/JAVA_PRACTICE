package Generics;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Student s =  new Student("Shashi", 26);

        Box<Student> b = new Box<>();
        b.setValue(s);

        Student result = b.getValue();
        System.out.println(result.name);
        System.out.println(result.age);

        Integer[] intArray = {1, 2, 3, 4};
        Student s1 = new Student("water", 25);

        Pair<String, Integer, Student> pair = new Pair<>();
        pair.setX("Hello");
        pair.setY(22);
        pair.setZ(s1);

        System.out.println(pair.Student.name);
        System.out.println(pair.Student.age);

        pair.printArray(intArray);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("juice", 22));
        studentList.add(new Student("cold water", 33));

        pair.printList(studentList);



//       Pair<Integer, Integer> pair = new Pair<>();
//       pair.setX(1);
//      pair.setY(2);
//       pair.getX();
//
//       pair.addition("1", 1);
//        pair.addition("1", "one");
    }
}
