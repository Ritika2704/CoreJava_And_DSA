package Oops.EncapsulationExample;

public class UserEncapsulation {
    public static void main(String[] args) {
        User user = new User(1, "Ritika", 22);
        System.out.println("Given User id: "+ user.getId());
        System.out.println("Name of User: " + user.getName());
        System.out.println("Age of user: "+ user.getAge());
        user.setId(1001);
        user.setName("Ritika Sinha");
        user.setAge(24);
        System.out.println("Given User id: "+ user.getId());
        System.out.println("Name of User: " + user.getName());
        System.out.println("Age of user: "+ user.getAge());


    }
}
