package homework;

import java.util.Scanner;

public class SumNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Natural number: ");
        int n= sc.nextInt();
        int sum =0;

        for(int i= 1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of n natural numbers: " + sum);
    }
}
