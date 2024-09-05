package homework;

import java.util.Scanner;
//6.Write a program that asks the user to enter 5 integers, stores them in an array, and prints the array.
//7.Write a program that calculates and prints the sum of all elements in an array.
//8.Write a program that calculates and prints the average of elements in an array.
public class UserArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[5];
        int sum =0;
        float avg = 0;
        System.out.println("Enter 5 element of array ");

        //initilize
        for(int i =0;i<5; i++){
            System.out.println("enter "+ (i+1) +"value: ");
            arr[i] = sc.nextInt();
            sum+= arr[i];
            avg = sum/arr.length;
        }
        //print
        for(int x:arr){
            System.out.print(x+ " ");
        }
        System.out.println("sum "+ sum);
        System.out.println("avg " +avg);


    }
}
