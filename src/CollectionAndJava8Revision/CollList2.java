package CollectionAndJava8Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollList2 {
    public static void main(String[] args) {

        //string to integer and then find sum

        //        the Integer::parseInt method is used because we are working with strings, and we need to convert them to int.
//                Since parseInt is a static method of the Integer class, we use the Integer class to call it.
//        List<String > list = new ArrayList<>(Arrays.asList("3", "2", "3", "2", "1"));
//        int sum = list.stream().mapToInt(Integer::parseInt).sum();
//        System.out.println("Sum of String: "+sum);

        // Convert each number to a String
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> collect = numbers.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(collect);
    }
}
