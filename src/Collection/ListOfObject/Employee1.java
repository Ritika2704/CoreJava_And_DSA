package Collection.ListOfObject;

import java.util.ArrayList;
import java.util.List;

public class Employee1 {
    int Id;
    String name;
    double salary;
    Employee1(int id, String name, double salary){
        this.Id = id;
        this.name = name;
        this.salary = salary;
    }
}
class main1 {
    public static void main(String[] args) {
        int[] ids ={101,102,103,104};
        String[] names = { "Ritika", "Riti", "Soni","Ritu"};
        double[] salaries = {105.98, 405.8, 100045.09, 230.8 };

        List<Employee1> stuList = new ArrayList<Employee1>();
        for(int i =0; i<=ids.length-1; i++){
            Employee1 e = new Employee1(ids[i], names[i], salaries[i]);
            stuList.add(e);
        }
        for(Employee1 ele: stuList){
            System.out.print(ele.Id+ ", "+ ele.name+ ", "+ ele.salary);
            System.out.println();
        }
    }
}
