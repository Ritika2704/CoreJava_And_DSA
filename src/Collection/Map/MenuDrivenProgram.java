package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Accounts{
    private int number;
    private String name;
    private double balance;
    private String location;

    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

public class MenuDrivenProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Accounts> accMap = new HashMap<Integer, Accounts>();
        while(true){
            System.out.println("1. Add Account");
            System.out.println("2. Update Location");
            System.out.println("3. Display Account");
            System.out.println("4. Remove Account");
            System.out.println("5. Quit");
            System.out.println("Enter your Choice ");
            int ch = sc.nextInt();
            if(ch==1){
                System.out.println("Enter your account number");
                Integer number = sc.nextInt();
                if(accMap.containsKey(number)){
                    System.out.println("Account Already Exist");
                }else{
                    System.out.println("Enter Name");
                    String name = sc.next();
                    System.out.println("Enter Balance");
                    double balance  = sc.nextDouble();
                    System.out.println("Enter Location");
                    String location = sc.next();

                    Accounts acc = new Accounts();
                    acc.setNumber(number);
                    acc.setName(name);
                    acc.setBalance(balance);
                    acc.setLocation(location);

                    accMap.put(number, acc);
                    System.out.println("Account Added");
                }
            }else if(ch==2){
                System.out.println("Enter Account Number");
                Integer number = sc.nextInt();
                if(accMap.containsKey(number)){
                    System.out.println("Enter your Updated Location ");
                    String loc = sc.next();
                    Accounts acc = accMap.get(number);
                    acc.setLocation(loc);
                    System.out.println("Location Updated");
                }else{
                    System.out.println("invalid account number");
                }

            } else if (ch==3) {

                System.out.println("Enter you account number");
                Integer number = sc.nextInt();
                if(accMap.containsKey(number)){
                    Accounts acc = accMap.get(number);
                    System.out.println("Details: "+ acc.getName()+", "+acc.getBalance()+", "+ acc.getLocation());
                }else{
                    System.out.println("invalid account number");
                }
            } else if (ch==4) {
                System.out.println("Enter your account number ");
                Integer number = sc.nextInt();
                if(accMap.containsKey(number)){
                    accMap.remove(number);
                    System.out.println("account removed");
                }else{
                    System.out.println("invalid account number");
                }
            }else if(ch==5){
                System.out.println("End");
                System.exit(1);
            }else {
                System.out.println("invalid choice");
            }
        }
    }
}

