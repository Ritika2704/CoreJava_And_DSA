package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
//       1 Display Stream information using forEach() and Lambda
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5,6));
        Stream<Integer> stream = list.stream();
        stream.forEach(s-> System.out.println(s));

    }
}
