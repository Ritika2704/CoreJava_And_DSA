package Collection.ListOfObject;

import java.util.ArrayList;
import java.util.List;

public class PojoMain {
    public static void main(String[] args) {
        int ids[] ={101,102,103,104,105,106};
        String names[]	={"Amar", "Hareen", "Sathya","Annie","Raji","Harsha"};
        double[] salaries = {30000, 35000, 40000, 45000, 42000, 50000};
        String[] depts ={"HR", "ADMIN", "HR", "IT", "ADMIN", "IT"};
        String[] locations	=	{"Hyderabad",	"Chennai",	"Bangalore",	"Hyderabad",
                "Pune",	"Bangalore"};

        List<PojoEmployee> PojoList = new ArrayList<PojoEmployee>();
        for(int i=0; i< ids.length; i++){
            PojoEmployee e = new PojoEmployee();
            e.setId(ids[i]);
            e.setName(names[i]);
            e.setSalary(salaries[i]);
            e.setDept(depts[i]);
            e.setLocation(locations[i]);
            PojoList.add(e);
        }
        System.out.println("details are: ");
        for(PojoEmployee ele: PojoList){
            System.out.println(ele.getId()+ ", "+ ele.getName()+", "+ ele.getSalary()+", "+ ele.getDept()+", "+ele.getLocation());

        }

        //Display Employee details whose ID is 103:
        boolean found = false;
        for (PojoEmployee ele: PojoList){
            if(ele.getId() == 103){
                System.out.println(ele.getId()+ ", "+ ele.getName()+", "+ ele.getSalary()+", "+ ele.getDept()+", "+ele.getLocation());
               found = true;
               break;
            }

        }
        if(!found){
            System.out.println("ID-103 doesn't exist");
        }
    }
}
