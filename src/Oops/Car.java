package Oops;

abstract class Vehical{
    public abstract void engine();
}
public class Car extends Vehical {
    public void engine(){
        System.out.println("Engine of a car");
    }

    public static void main(String[] args) {
        Vehical v = new Car();
        v.engine();
    }
}
