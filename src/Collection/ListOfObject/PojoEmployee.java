package Collection.ListOfObject;

public class PojoEmployee {
    private int id;
    private  String name;
    private double salary;
    private String dept;
    private String Location;

    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    double getSalary(){
        return this.salary;
    }
    String getDept(){
        return this.dept;
    }
    String getLocation(){
        return this.Location;
    }

    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    void setDept(String dept){
        this.dept = dept;
    }
    void setLocation(String Location){
        this.Location = Location;
    }
}
