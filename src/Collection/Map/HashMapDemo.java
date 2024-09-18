package Collection.Map;

import java.util.HashMap;
import java.util.Map;
//HashMap: doesn’t maintain insertion order. Allows only one null key
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(10, "Ten");
        hm.put(20, "Twenty");
        hm.put(30, "Thirty");
        hm.put(10, "Forty");
        System.out.println("HashMap: "+ hm);
    }
}
