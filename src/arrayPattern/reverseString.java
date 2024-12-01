package arrayPattern;

import java.util.stream.Collectors;

public class reverseString {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = "";

                for(int i = original.length()-1; i>=0; i--){
                    reversed += original.charAt(i);
                }

                String reversedNew = original.chars().mapToObj(c-> (char) c)
                        .collect(Collectors.collectingAndThen(Collectors.toList(),
                                list ->{ java.util.Collections.reverse(list);
                            return list.stream();
    }
    ))
            .map(String::valueOf).collect(Collectors.joining());

        System.out.println("reversed Sting :"+ reversedNew);
    }
}
