package homework;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++){
            int mul = n*i;
            System.out.println(n +" x "+ i + "= "+ mul);
        }
    }
}
