package Collection.ArrayListDemoProgram;
// in list or we can say arrayList indexing starts from 0 only
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> NewList = new ArrayList<>();
        NewList.add(23);
        NewList.add(33);
        NewList.add(43);
        NewList.add(53);
        NewList.add(63);
        System.out.println("List is: "+ NewList);
        System.out.println("Size of List: " +NewList.size());

    }
}
