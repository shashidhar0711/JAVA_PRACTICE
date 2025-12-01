package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        // without lamdas
        lamdas l = new lamdas();
        Thread t = new Thread(l);
        t.start();

        // with lamdas
        Runnable r = () -> {
            System.out.println("In Lamdas expression");
        };
        Thread t2 = new Thread(r);
        t2.start();

        // another scenario
        addition add = (a,b) -> {
            return a + b;
        };
        int res = add.add(10, 20);
        System.out.println(res);


        // Streams

        System.out.println("Streams practice");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(16);
        integerList.add(4);
        integerList.add(9);
        integerList.add(-1);

        Stream<Integer> s = integerList.stream();
        s.forEach((element) -> {
            System.out.println(element);
        });

        Stream<Integer> s2 = integerList.stream();
        s2.filter((ele) -> {
            System.out.println("filtering "+ele);
            return ele %2==0;
        }).forEach((ele) ->{
            System.out.println(ele);
        });

        Stream<Integer> s3 = integerList.stream();
        s3.filter((ele)->{
            System.out.println("filtering s3 "+ ele);
            return ele %2==0;
        }).sorted((obj1, obj2) -> {
            if (obj1 < obj2) {
                return -1;
            } else if ( obj2 > obj1) {
                return 1;
            } return 0;
        }).forEach((ele) -> {
            System.out.println("Printing "+ ele);
        });

        Stream<Integer> s4 = integerList.stream();
        s4.filter((ele)->{
            System.out.println("filtering s4 "+ ele);
            return ele %2==0;
        }).sorted((obj1, obj2) -> {
            if (obj1 < obj2) {
                return -1;
            } else if ( obj2 > obj1) {
                return 1;
            } return 0;
        }).map((ele) -> ele+" HI").forEach((ele) -> {
            System.out.println("Printing s4 "+ele);
        });

        Stream<Integer> s5 = integerList.stream();
        s5.map(ele -> ele * 2).filter((ele)->{
            System.out.println("filtering s5 "+ ele);
            return ele %2==0;
        }).sorted((obj1, obj2) -> {
            if (obj1 < obj2) {
                return -1;
            } else if ( obj2 > obj1) {
                return 1;
            } return 0;
        }).map((ele) -> ele+" HI").forEach((ele) -> {
            System.out.println("Printing s5 "+ele);
        });

        Stream<Integer> s6 = integerList.stream();
          Integer result = s6.filter((ele) -> {
            System.out.println("filtering s6 "+ ele);
            return ele %2==0;
        }).reduce((a, b) -> a*b).orElse(-1);

          System.out.println("Printig the result: "+result);

        List<Integer> interg = new ArrayList<>();
        Stream<Integer> s7 = integerList.stream();
        Stream<Integer> s8 = interg.stream();
        Integer result2 = s8.filter((ele) -> {
            System.out.println("filtering s8 "+ ele);
            return ele %2==0;
        }).reduce(0,(a, b) -> a+b);

        System.out.println("Printig the result: "+result2);
    }
}
