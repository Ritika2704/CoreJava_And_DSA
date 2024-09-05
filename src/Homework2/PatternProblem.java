package Homework2;

public class PatternProblem {
    public static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int s=1; s<=i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int s=1; s<=i; s++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int s=n; s>=i; s--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int x = 1;
            for (int k = 1; k <= i; k++) {
                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern7(5);
    }
}
