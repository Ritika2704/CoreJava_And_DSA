package Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet: It maintains insertion order of elements.
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> llHashSet = new LinkedHashSet<>();
        llHashSet.add(50);
        llHashSet.add(40);
        llHashSet.add(30);
        llHashSet.add(20);
        llHashSet.add(10);
        System.out.println("LinkedHashSet: "+ llHashSet);
    }
}
