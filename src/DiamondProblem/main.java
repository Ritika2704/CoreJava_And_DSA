package DiamondProblem;


class A{
 void display(){
     System.out.println("A");
 }
}
class B extends A{
    void display(){
        System.out.println("B");
    }
}
class C extends A{
    void display(){
        System.out.println("C");
    }
}
// If Java allowed multiple inheritance
//public class main extends B, C {
//    // What version of display() should main inherit: B's or C's?
//}

//If class main inherits from both B and C, both of which override the display() method from class A,
//        Java would not know whether to use B's or C's display() method in class D.
//This ambiguity is the essence of the diamond problem. Java avoids this issue by prohibiting multiple inheritance with classes.


