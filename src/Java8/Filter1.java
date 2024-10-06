package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter1 {
    public static void main(String[] args) {

        // 1 Program to filter the Strings starts with “s”in a list:
//        List<String> list = new ArrayList<>(Arrays.asList("sun", "moon", "java", "sofa", "soni"));
//        List<String> str = list.stream().filter(s -> s.startsWith("s")).filter(l-> l.length()==4).collect(Collectors.toList());
//        System.out.println(str);

       // 2 Program to display only even numbers in the list using stream api:

//        List<Integer> collect = Stream.iterate(0, s -> s + 1)
//                .limit(30)
//                .filter(e -> e % 2 == 0)
//                .peek(System.out::println)
//                .sorted(Comparator.reverseOrder()) //descending
//                .collect(Collectors.toList());
//        System.out.println(collect);

//        3 Store into Set:
//        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,5,5,6,7,8));
//        Set<Integer> collect = list.stream().map(s -> s * s).collect(Collectors.toSet());
//        System.out.println(collect);

//        4 Counting elements:
//        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8));
//        Long collect = list.stream().filter(s -> s < 6).collect(Collectors.counting());
//        System.out.println(collect);

//        5 if we have a list of string "ritika", and if do want the same name
        List<String> list = new ArrayList<>(Arrays.asList("ritikaa", "ritu", "ruby","ritika"));
        Optional<String> ritika = list.stream().filter(s -> s.equals("ritika")).findAny();
        ritika.ifPresent(System.out::println);

//        6 [[5, 7, 11, 13], [1, 3, 5], [2, 4, 6, 8]]
//        return output like this [5, 7, 11, 13, 1, 3, 5, 2, 4, 6, 8]
//        List<List<Integer>> list = Arrays.asList(
//           Arrays.asList(5,7,11,13),
//           Arrays.asList(1,3,5),
//           Arrays.asList(2,4,6,8)
//        );
//        List<Integer> collect = list.stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(collect);

    }


}
