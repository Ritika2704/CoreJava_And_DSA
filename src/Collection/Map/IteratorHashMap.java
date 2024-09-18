package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorHashMap {
    public static void main(String[] args) {
        String books[] = { "C", "C++", "Java", "Python"};
        int prizes[] ={ 20, 30, 40, 30};
        Map<String, Integer> hMap = new HashMap<String, Integer>();
        for (int i=0; i<books.length; i++){
            hMap.put(books[i], prizes[i]);
        }
        System.out.println("Display Map: ");
        Set<String> keys = hMap.keySet();
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()){
            String key = itr.next();
            int value = hMap.get(key);
            System.out.println(key +" = "+ value);
        }
    }
}
