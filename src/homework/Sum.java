package homework;

import java.util.Scanner;

//4.Write a program that prompts the user to enter two numbers and prints their sum.
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value 1: ");
        int val1= sc.nextInt();
        System.out.print("Enter value 2: ");
        int val2= sc.nextInt();
        int sum = val1 + val2;
        System.out.println("Sum is: "+ sum);
    }
}
