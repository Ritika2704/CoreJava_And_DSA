package Collection.ArrayListDemoProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertSpecificIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=10; i<=60; i+=10){
            list.add(i);
        }
        System.out.println("enter location");
        int loc = sc.nextInt();
        if(loc>=0 && loc< list.size()){
            System.out.println("Enter your element to insert");
            int ele = sc.nextInt();
            list.add(loc, ele);
            System.out.println("List:"+ list );
        }else
        {
            System.out.println("Invalid element");
        }
    }
}
