
interface Vehical{
    static void body(){
        System.out.println("static method");
    }
    default String airBags(){
        return "twoAirBags";
    }
    default String engine(){
        return "PowerfulEngine";
    }
    int maxSpeed();
}

class Tata implements Vehical{
    @Override
    public int maxSpeed() {
        return 120;
    }
}
class Audi implements Vehical{
    @Override
    public int maxSpeed() {
        return 400;
    }
}

public class Interface {
    public static void main(String[] args) {
    Audi superC = new Audi();
    Vehical car = new Tata();

        // Call static method using the interface name
        Vehical.body();
        System.out.println("Car airbags "+car.airBags()+", and engine is "+ car.engine()+", with good speed "+ car.maxSpeed());
    }
}
