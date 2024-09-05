package homework;

import java.util.Scanner;

//17.Write a program that asks the user to enter a number and checks if that number is present in an array.
public class CheckArray {
    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        boolean isfound = false;
        int num = sc.nextInt();
        for(int i =0; i< arr.length; i++){
             if (num == arr[i]){
                 isfound = true;
                 break;
             }

        }
        if (isfound) {
            System.out.println("The number " + num + " is present in the array.");
        } else {
            System.out.println("The number " + num + " is not present in the array.");
        }
    }
}
