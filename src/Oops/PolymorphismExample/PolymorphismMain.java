package Oops.PolymorphismExample;

class Shape{
    public void area(){
        System.out.println("We can find area of any shape using formula");    }
}
class Circle extends Shape{
    @Override
    public void area() {
        System.out.println("to find area of is pi*r*r");
    }
}

public class PolymorphismMain {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.area();
    }
}
