package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// map and filter practice questions
public class MapAndFilter {
    public static void main(String[] args) {

//        1 Filter and map positive	integers	to their	squares:
//        ArrayList<Integer> SquareList = new ArrayList<>(Arrays.asList(-1,7,8,2,-3,4));
//        List<Integer> collect = SquareList.stream().filter(s -> s > 0).map(p -> p * p).collect(Collectors.toList());
//        System.out.println(collect);

//        2 Filter and map strings to their uppercase versions:
//        List<String> list = Arrays.asList("apple", "mango", "banana", "kiwi");
//        List<String> res = list.stream().map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(res);

//       List<Student> students = new ArrayList<>();
//        students.add(new Student("Ritika", 102));
//        students.add(new Student("Ritu", 101));
//        students.add(new Student("Ruby", 105));
//        students.add(new Student("Raj", 103));
//
//        // Sort the list based on roll number using Stream API
//        List<Student> sortedStudents = students.stream()
//                                               .sorted((s1, s2) -> Integer.compare(s1.rollNumber, s2.rollNumber))
//                                               .collect(Collectors.toList());
//
//        // Print the sorted list
//        sortedStudents.forEach(System.out::println);

       // 3 find average of even numbers
        List<Integer> numbers = Arrays.asList(2,4,5,6,8);
        double v = numbers.stream()
                .filter(s -> s % 2 == 0)
                .mapToInt(Integer::intValue)
                .average().orElse(0);
        System.out.println(v);
//    }

    }
}
