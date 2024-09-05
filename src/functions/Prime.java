package functions;

import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=n-1; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    //optimized approach
    public static boolean isPrimeOptimize(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }return true;
    }

    //print print in range
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrimeOptimize(i)){ //true
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number to check Prime or not: ");
//        int num= sc.nextInt();
//        System.out.println(num + " is prime ? = "+ isPrime(num)  );
//        System.out.println(num + " is prime ? = "+ isPrimeOptimize(num)  );
        primeInRange(30); //2-20
    }
}
