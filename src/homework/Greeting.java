package homework;

import java.util.Scanner;

//3.Write a program that asks the user to enter their name and age, then prints a greeting message that includes the entered name and age.
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name= sc.nextLine();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("Hey! Good Morning "+ name + " your age is: " +age);

    }
}
