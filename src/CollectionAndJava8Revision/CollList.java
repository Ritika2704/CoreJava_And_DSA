package CollectionAndJava8Revision;

import java.util.*;
import java.util.stream.Collectors;

//Consider the list = [13, 22, 96, 23, 13, 76, 22, 45]


public class CollList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(13,22,96,23,13,76,24,45));

        //        1. Display	all values of list
//        list.stream().forEach(System.out::println);

//        2. Display	elements of list in reverse order
        //simple way
//        for (int i = list.size()-1; i>= 0; i--){
//            System.out.println(list.get(i));
        //using stream
//        Collections.reverse(list);
//        list.stream().forEach(System.out::println);

        //3. Display	even count and odd count in the list
//        int evenCount =0;
//        int oddCount= 0;
//        for( int num : list){
//            if(num % 2 ==0){
//                //evenCount++;
//            }else
//                oddCount++;
//        }
//
//        //stream
//        long count = list.stream().filter(s -> s % 2 == 0).count();
//        System.out.println("evenCount: "+ count);
//        System.out.println("oddCount: "+ oddCount);
//        }

        //4. Display only	first even number in the given list
//        for(int num: list){
//            if(num%2==0){
//                System.out.println(num);
//                return;
//            }
//        }
        //stream
//        Optional<Integer> firstE = list.stream().filter(s -> s % 2 == 0).findFirst();

//        //5.  find last element that is even
//        Optional<Integer> last = list.stream().filter(s -> s % 2 == 0).reduce((first, second)->second);
//        System.out.println(last);

       // 6. Find the sum of all elements in the list

//           int Sum =list.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(Sum);

        //7. Find the sum of elements in the list which are	divisible by	2	but not with 3.
//        int sumValue = list.stream()
//                .filter(s -> s % 2 == 0)
//                .filter(s -> s % 3 != 0)
//                .peek(System.out::println)
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(sumValue);

        // 8. Find the biggest element in the given list
        int max = list.stream()
                .mapToInt(Integer::intValue)
                .max().orElseThrow(() -> new RuntimeException("list is empty"));
        System.out.println("max of list: "+ max);

        //10. Find the smallest element in the given list
        int min = list.stream().mapToInt(Integer::intValue).min().orElseThrow(()-> new RuntimeException("list is empty"));
        System.out.println("min of list: "+ min);
        System.out.println(1 + "2" + 3);

        //list a) filter out the all even elements and divide the each element by 2 and print sum of all elements
//        the Integer::parseInt method is used because we are working with strings, and we need to convert them to int.
//                Since parseInt is a static method of the Integer class, we use the Integer class to call it.
        int sum = list.stream().filter(s -> s % 2 == 0).mapToInt(s -> s / 2).sum();
        System.out.println("sum "+ sum);

    }
}
