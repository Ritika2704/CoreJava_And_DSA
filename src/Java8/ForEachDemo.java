package Java8;

import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(20,30,23,10,50));
        Set<String> names = new HashSet<>(Arrays.asList("Tom", "Ram", "Chris", "Appu"));
       // list.forEach(x-> System.out.println(x));

        // method reference part
//        list.forEach(ForEachDemo::print);
        list.forEach(System.out::println);
        names.forEach(System.out::println);

    }
    // method reference
//    public static void print(int n){
//        System.out.println(n);
//    }
}
