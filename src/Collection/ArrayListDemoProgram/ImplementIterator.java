package Collection.ArrayListDemoProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//display arrayList using iterator
// if we move forward we use hasnext() and next()
public class ImplementIterator {
    public static void main(String[] args) {
        List<Integer> listItr = new ArrayList<>();
        for(int i=1; i<=5; i++){
            listItr.add(i*5);
        }

        System.out.println("Display using Iterator");
        Iterator<Integer> itr = listItr.iterator();
       while(itr.hasNext()){
           Integer ele = itr.next();{
               System.out.println(ele);
           }
        }
    }
}

