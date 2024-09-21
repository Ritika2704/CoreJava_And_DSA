package Java8;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ForEachPrac1 {
    public static void main(String[] args) {
        //  1  Doubling the values in a LinkedList:
//        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(2,4,5,6,7,8));
//        nums.forEach(n-> System.out.println(n*n));

 //       2  Checking if any string in a HashSet starts with "A":
//        Set<String> words = new HashSet<>(Arrays.asList("Apple", "appricot", "banana","kiwi"));
//        words.forEach(s-> {
//            if (s.startsWith("A") || s.startsWith("a")) {
//                System.out.println(s);
//            }
//            });

//       3  Removing all even numbers from an ArrayList:
//        ArrayList<Integer> even = new ArrayList<>(Arrays.asList(2,4,5,6,7,9));
//        List<Integer> collect = even.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());
//        System.out.println(collect);

      // 4 Counting the number of occurrences of a specific string in an ArrayList:
        ArrayList<String> number = new ArrayList<>(Arrays.asList("apple", "kiwi", "orange", "apple", "apple"));
        String target = "apple";
        AtomicInteger count = new AtomicInteger();
        number.forEach(s->{if(s.equals(target)){
        count.getAndIncrement();}
        });
        System.out.println(target+ " count: "+ count);
    }

}
