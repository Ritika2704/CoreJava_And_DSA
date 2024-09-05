package Collection.ArrayListDemoProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementPresence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<Integer>();
        for(int i=2; i<=20; i+=4){
          l.add(i);
        }
        System.out.println("List: "+ l);
        System.out.println("Enter your element: ");
        int ele = sc.nextInt();
        int index = l.indexOf(ele);
        if(l.contains(ele) && index != -1 ){
            System.out.println(ele + " is present is at " + index);
        }
        else{
            System.out.println("no such element is present");
        }
    }
}
