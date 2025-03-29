package StringQuestions;

import java.util.ArrayList;

public class CallByValue {
    public static void main(String[] args) {
        // Passing a primitive type (int) by value
        int num =10;
        System.out.println("Before calling modify value num: "+ num);
        modifyValue(num);
        System.out.println("After calling modify value num: "+ num);

        // Passing an object (StringBuilder) by value (passing reference by value)
        StringBuilder str = new StringBuilder("Hello");
        System.out.println("Before calling modify reference: "+ str);
        modifyReference(str);
        System.out.println("After calling modify reference: "+ str);


        // one more example for objects

//        The reference to myList (not the actual object) is passed to the method.
//        So inside the method, you can access and modify the contents of the list, because both
//        the method and the caller are working with the same object.
//
//        When you modify the object (like adding 10 to the list), the change is reflected outside
//        the method as well, because both the method and the caller are pointing to the same object
//        in memory.

//        Even though you created a new ArrayList inside the method and added an element to it,
//        the reference myList outside the method is still pointing to the original (empty) list.
//        This happens because the reference itself was passed by value. You only changed the reference
//        inside the method, not the original one outside.

        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
        modifyList(list);
        System.out.println("calling modify list After adding value: "+ list);
        reassignList(list1);
        System.out.println("calling reassign list After adding value: "+ list1);

    }
    public static void modifyValue(int num){
        num+=5;
        System.out.println(" num value modify inside method: " + num);
    }
    public static void modifyReference(StringBuilder str){
        str.append("World");
        System.out.println("Inside Modify Reference str: "+ str);
    }
    public static void modifyList(ArrayList<Integer> list){
        list.add(10);
    }
    public static void reassignList(ArrayList<Integer> list1){
        list1 = new ArrayList<>();
        list1.add(20);
    }
}

//For primitives: The value itself is passed, so changes inside the method don’t affect the original variable.

//For objects: The reference to the object is passed by value. You can modify the object’s state inside
//the method (because both the method and the caller refer to the same object), but reassigning the reference
//inside the method doesn't change the original reference outside the method.
