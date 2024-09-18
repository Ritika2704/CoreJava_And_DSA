package Collection.ListOfObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Store	objects	to list	until user quits
public class Employee2 {
    int Id;
    String name;
     double salary;

     Employee2(int id, String name, double salary){
         this.Id = id;
         this.name=  name;
         this.salary = salary;
     }
}
class User{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee2> list = new ArrayList<Employee2>();

        while(true) {
            System.out.println("Enter the Value of Employee Id, name , Salary: ");
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();
            Employee2 e = new Employee2(id, name, salary);
            list.add(e);

            System.out.print("Do you want to add another record(yes/no): ");
            String choice = sc.next();
            if(choice.equals("no")){
                break;
            }

        }
        System.out.println("details are: ");
        for (Employee2 e: list){
            System.out.print(e.Id+ ",  "+ e.name+ ", "+ e.salary);
            System.out.println();
        }
    }
}