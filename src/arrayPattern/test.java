package arrayPattern;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//find the occurrence of each element in an int array ?

public class test {
    public static void main(String[] args) {
       int[] arr = {1,2,3,1,3,4,5};
       HashMap<Integer, Integer> OccurranceMap = new HashMap<>();

       for( int ele: arr){
           OccurranceMap.put(ele, OccurranceMap.getOrDefault(ele, 0)+1);
       }

        System.out.println("Occurrance"+ OccurranceMap);

    }
}

