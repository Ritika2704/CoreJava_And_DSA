package Collection.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"Arjun", 29));
        list.add(new Student(2,"Bubu", 19));
        list.add(new Student(3,"Cutu", 49));
        list.add(new Student(4,"Durgesh", 39));
        list.add(new Student(5,"Elu", 59));
        System.out.println("Sort by Age");
        Collections.sort(list, new AgeComparator());
        System.out.println("After Sort:");
        for (Student st: list){
            System.out.println(st.RollNo+","+st.Name+", "+st.Age);
        }
    }
}
