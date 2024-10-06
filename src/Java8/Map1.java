package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map1 {
    public static void main(String[] args) {
//       1 Convert a list of strings to uppercase:
//        List<String> list = new ArrayList<>(Arrays.asList("hi", "hello", "hola", "hey"));
//        List<String> str = list.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        System.out.println(str);
//
//       2 Square all the numbers in a list of integers
//        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,4,5,6,1));
//        List<Integer> square = nums.s\]\\tream().map(s-> s*s).collect(Collectors.toList());
//        System.out.println(square);

//        3 Extract the lengths of strings in a list
        List<String> list = Arrays.asList("I" ,"am", "Thankful", "God");
      //  List<Integer> str = list.stream().map(String::length).collect(Collectors.toList());
        List<Integer> str = list.stream().map(s-> s.length()).collect(Collectors.toList());
        System.out.println(str);

//        4 Get the first character of each string in a list:
//        List<String> list = Arrays.asList("I" ,"am", "Thankful", "God");
//        List<Character> str = list.stream().map(s->s.charAt(0)).collect(Collectors.toList());
//        System.out.println(str);
    }
}
