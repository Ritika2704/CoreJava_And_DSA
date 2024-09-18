package Collection.ComparatorInterface;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if(s1.Age > s2.Age){
            return 1;
        }else{
            return -1;
        }
    }
}
