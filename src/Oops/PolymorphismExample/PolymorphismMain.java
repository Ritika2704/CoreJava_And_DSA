package Oops.PolymorphismExample;

class Shape{
    public void area(){
        System.out.println("We can find area of any shape using formula");    }
}
class Circle extends Shape{
    @Override
    public void area() {
        System.out.println();
    }
}

public class PolymorphismMain {
}
