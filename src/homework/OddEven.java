package homework;

import java.util.Scanner;


public class OddEven {
    public static void printEven(int[] arr){
        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOdd(int[] arr){
        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("enter num"+i+ ": ");
             arr[i] = sc.nextInt();
        }
        printEven(arr);
        printOdd(arr);
    }


}
