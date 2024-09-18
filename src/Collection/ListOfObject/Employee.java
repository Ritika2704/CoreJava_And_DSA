package Collection.ListOfObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employee {
    int Id;
    String name;
    double salary;
    Employee(int id, String name, double salary ){
        this.Id = id;
        this.name = name;
        this.salary = salary;
    }

}
class main{
    public static void main(String[] args) {
        List<Employee> stuList = new ArrayList<Employee>();

//        Employee e1 = new Employee(101, "Ritika", 100000.00);
//        Employee e2 = new Employee(102, "Chris", 100000);
//        Employee e3= new Employee(103, "Ruby", 200000);
//        stuList.add(e1);
//        stuList.add(e2);
//        stuList.add(e3);

//        another approach
stuList.add(new Employee(101, "Ritika", 100000.00));
stuList.add(new Employee(102, "Chris", 100000));
stuList.add(new Employee(103, "Ruby", 200000.7));

//   Displaying using Foreach loop
//        System.out.println("Here is the list of Student");
//        for(Employee e: stuList){
//            System.out.print(e.Id+ " , "+ e.name+ " , "+ e.salary);
//            System.out.println();
//        }

        //Displaying using for loop
//        System.out.println("List of Student:");
//        for(int i = 0; i<stuList.size(); i++){
//            Employee e= stuList.get(i);
//            System.out.print(e.Id+ " , "+ e.name+ " , "+ e.salary);
//            System.out.println();
//        }

        //Displaying using iterator
//        System.out.println("List of Student:");
//        Iterator<Employee> stuItr = stuList.iterator();
//        while (stuItr.hasNext()){
//            Employee e = stuItr.next();
//            System.out.print(e.Id+ " , "+ e.name+ " , "+ e.salary);
//            System.out.println();
//        }
//
//        Display reverse list using ListIterator:
        System.out.println("List of Student:");
        ListIterator<Employee> listItr = stuList.listIterator(stuList.size());
        while (listItr.hasPrevious()){
            Employee e = listItr.previous();
            System.out.print(e.Id+ " , "+ e.name+ " , "+ e.salary);
            System.out.println();
        }

    }
}
