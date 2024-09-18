package Collection.ArrayListDemoProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<>();
        for(int i=1; i<=12; i+=2){
            l1.add(i);
        }
        System.out.println("list: "+l1);
        System.out.print("Enter your element: ");
        int ele = sc.nextInt();
        if(l1.contains(ele)){
            System.out.print("Enter your number that is going to replace the existing element: ");
            int val = sc.nextInt();
            int loc = l1.indexOf(ele);
            l1.set(loc, val);
            System.out.println("list: "+l1);
        }else {
            System.out.println("element not found");
        }
    }
}
