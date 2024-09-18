package Collection.ListOfObject;

import java.util.*;

//Following program explains how to perform ArrayList operations such as Append, Insert,Replace,
//Update, Remove,	Sort, Reverse	and Display:
public class MenuDriven {
    public static void main(String[] args) {
        List<Integer> Menu = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("1. Append");
            System.out.println("2. Insert");
            System.out.println("3. Replace");
            System.out.println("4. Remove");
            System.out.println("5. Sort");
            System.out.println("6. Reverse");
            System.out.println("7. Display");
            System.out.println("8. Quit");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            if(ch==1){
                System.out.println("Enter element to append");
                int ele = sc.nextInt();
                Menu.add(ele);
                System.out.println("element is added");
            } else if (ch ==2) {
                System.out.println("Enter Location where to insert ");
                int loc = sc.nextInt();
                if(loc>=0 && loc<Menu.size()){
                    System.out.println("Enter your element: ");
                    int ele = sc.nextInt();
                    Menu.add(loc, ele);
                    System.out.println("element is inserted");
                }else{
                    System.out.println("location not found!");
                }
            }else if(ch== 3){
                System.out.println("enter the element that wanted to replace");
                int ele = sc.nextInt();
                if(Menu.contains(ele)){
                   int index= Menu.indexOf(ele);
                    System.out.println("enter element");
                    int e = sc.nextInt();
                    Menu.set(index, e);
                    System.out.println("element replaced");
                }else{
                    System.out.println("element not found");
                }
            }else if(ch==4){
                System.out.println("Enter element to remove ");
                int ele= sc.nextInt();
                if(Menu.contains(ele)){
                    int index = Menu.indexOf(ele);
                    Menu.remove(index);
                    System.out.println("element removed");
                }else{
                    System.out.println("element not found");
                }
            } else if (ch==5) {
                Collections.sort(Menu);
                System.out.println("List is sorted");
            }else if(ch==6){
                Collections.reverse(Menu);
                System.out.println("List is reversed");
            }else if(ch==7){
                if(Menu.isEmpty()){
                    System.out.println("List is empty");
                }else{
                    for(int e: Menu ){
                        System.out.print(e+ ", ");
                    }
                }
            }else if (ch==8){
                System.out.println("End it");
                System.exit(1);
            }else {
                System.out.println("INVALID ENTRY");
            }
        }
    }
}
