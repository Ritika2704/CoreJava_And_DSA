package Collection.Set;

import java.util.HashSet;
import java.util.Set;

//Output: Random order of elements
//HashSet: It doesn’t maintain insertion order
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(60);
        hs.add(50);
        hs.add(40);
        hs.add(30);
        hs.add(20);
        System.out.println("Set: "+ hs);
    }
}
