package Oops;


class Ritika{
    public void friend(){
        System.out.println("I have two friends ");
    }
}
class Anjali extends Ritika{
    //overriding the topic of polymorphism
    @Override
    public void friend() {
        System.out.println("I have so many friends");
    }
}
class Chris extends Anjali{
    public void city(){
        System.out.println("Iam going to the new city");
    }
}
public class Inheritance {
    public static void main(String[] args) {
       Ritika r = new Anjali();
       r.friend();
        Chris riti = new Chris();
        riti.friend();
        riti.city();
    }
}
