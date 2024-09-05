package Collection.ArrayListDemoProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<=12; i+=2) {
            list.add(i);
        }
        System.out.println("List: "+ list );
        System.out.println("Enter your index");
        int Index = sc.nextInt();
        if(Index>=0 && Index< list.size()){
            list.remove(Index);
            System.out.println("List: "+ list );
        }
        else{
            System.out.println("invalid input");
        }
    }
}
