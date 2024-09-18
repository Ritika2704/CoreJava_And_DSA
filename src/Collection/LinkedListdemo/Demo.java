package Collection.LinkedListdemo;

import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Orange");
        ll.add("Peach");
        System.out.println("LinkedList: "+ ll);

        //Retriving
        String First = ll.getFirst();
        String Last = ll.getLast();
        String ele = ll.get(2);
        System.out.println("First: "+ First+", Position 2: "+ele+ " Last: "+ Last);

        //searching
        boolean HaveBanana = ll.contains("Banana");
        System.out.println(HaveBanana);

        //remove
        ll.remove(1);
        System.out.println(ll);

        //size
        int size = ll.size();
        System.out.println(size);
    }
}
