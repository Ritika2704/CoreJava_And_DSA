package Oops;

class Cars{
    private int speed;
    private String color;
    public void setSpeed(int speed){
        if(speed<0){
            System.out.println("not acceptable");
        }
        else {
            this.speed = speed;
            System.out.println( "you are driving at "+ speed);
        }
    }

    public void setColor(String color){
        this.color = color;
        System.out.println(color +" is the color of your car");
    }
}
public class Encapsulation {
    public static void main(String[] args) {
       Cars obj = new Cars();
       obj.setSpeed(90);
       obj.setColor("Yellow");
    }
}
