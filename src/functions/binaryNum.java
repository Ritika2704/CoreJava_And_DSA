package functions;

import java.util.Scanner;

public class binaryNum {
    public static void PrintBinary(int binNum){
        int actualnum = binNum;
         int pow =0;
        int decimal =0;
         while (binNum>0){
             int lastdig = binNum%10;
              decimal = decimal + (lastdig * (int)Math.pow(2,pow));
             pow++;
             binNum = binNum/10;
         }
        System.out.println("decimal of " +actualnum+ " is " +decimal);
    }

    public static void printDecimal(int decNum){
        int actualNum = decNum;
        int power = 0;
        int binary = 0;
        while(decNum>0){
            int rem = decNum%2;
            binary = binary+ (rem * (int)Math.pow(10, power));
            power++;
            decNum = decNum/2;

        } System.out.println("decimal of " +actualNum+ " is " +binary);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Binary num: ");
        System.out.print("Enter Decimal num: ");
        int num= sc.nextInt();
//        PrintBinary(num);
         printDecimal(num);
    }
}
