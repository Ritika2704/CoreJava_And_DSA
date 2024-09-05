package Oops;

import java.util.Locale;

class Parent{
    String name;

    void details(){
        System.out.println(name.toUpperCase());
    }
}

 public class Child extends Parent{
    String name;

     @Override
     public void details() {
         super.name = "parent";
         name = "child";
         System.out.println(super.name+" and "+ name);
         super.details();
     }
     public static void main(String[] args) {
        Child cobj = new Child();
        cobj.details();
     }
 }


