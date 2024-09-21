package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExp {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(Arrays.asList("banana", "apple", "orange", "kiwi"));
//        System.out.println("Before sorting: " + list);
//        // Sort the list in descending order
//        list.sort((s1, s2) -> s2.compareTo(s1));
//        System.out.println("After sorting: " + list);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
// Filter even numbers and collect the result into a new list
        List<Integer> Oddnumbers = numbers.stream().filter(i-> i%2 !=0).collect(Collectors.toList());
        System.out.println(Oddnumbers);
    }
}
