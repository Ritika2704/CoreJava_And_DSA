package Collection.ArrayListDemoProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//display the element of specified index
public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list =new ArrayList<Integer>();
        for(int i =10; i<=50; i+=10){
            list.add(i);
        }

        System.out.println("List:" +list);
        System.out.println("Enter the value");
        int loc = sc.nextInt();
        if(loc>=0 && loc<= list.size()-1){
            System.out.println("Element @index "+loc+ " is: " + list.get(loc));
        }else {
            System.out.println("Invalid value");
        }

    }
}
