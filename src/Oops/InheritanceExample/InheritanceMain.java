package Oops.InheritanceExample;

class Animal{
    public void eat(){
        System.out.println("This animal eat food");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("The dog barks");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("the cat meow ");
    }
}
public class InheritanceMain {
    public static void main(String[] args){
        Animal a1 = new Dog();
        a1.eat();
        System.out.println("/////////////////////////////////");
        Dog d1 = new Dog(); // same with cat
        d1.bark();
        d1.eat();
    }
}
