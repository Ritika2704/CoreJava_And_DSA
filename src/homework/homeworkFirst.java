package homework;

import java.util.Scanner;

public class homeworkFirst {

//1. Write a program that declares three variables of different types (int, double, String) and assigns values to them. Print these values.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer value: ");
        int intValue =  sc.nextInt();
        System.out.print("Enter double value: ");
        double doubleVal = sc.nextDouble();

        System.out.print("Enter String value:");
//        String stringVal= " Hello Everyone ";
//        To prevent this, you can call nextLine() after nextDouble() (or nextInt()) to consume the leftover newline character.
//        This ensures that the subsequent call to nextLine() correctly reads the user's string input.
        sc.nextLine(); // Clear the buffer
        String stringVal= sc.nextLine();

        System.out.println("The values are :\n  integer value- " + intValue+ " double value- " + doubleVal + " String value- " +stringVal );
    }
}
