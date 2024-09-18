package Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<=4; i++){
            list.add(i+2);
            list.add(i+3);

        }
        System.out.println("arrayList: "+ list);
        Set<Integer> hashSet = new HashSet<Integer>(list);
        System.out.println("HashSet: "+hashSet);
    }
}
