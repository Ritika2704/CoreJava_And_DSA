package Collection.ArrayListDemoProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ImplementListIterator {
    public static void main(String[] args) {
        //using listIterator we move forward using method that is hasNext() and next()
        //using listIterator if we want to move backward method we used hasPrevious() and Previous()
        List<Integer> listItr = new ArrayList<Integer>();
        for(int i =1; i<=4; i++){
            listItr.add(i*3);
        }
        //forward
//        ListIterator<Integer> Lt = listItr.listIterator();
//        while(Lt.hasNext()){
//            System.out.println(Lt.next());


        //backward
//        ListIterator<Integer> Lt =listItr.listIterator(listItr.size());
//        while(Lt.hasPrevious()){
//            System.out.println(Lt.previous());

//       Display list from specified index value:

        ListIterator<Integer> ele = listItr.listIterator(3);
        while(ele.hasNext()){
            System.out.println(ele.next());
        }

    }
}
