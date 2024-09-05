package functions;



public class Product {
    //multiply 2 numbers
    public static int multiply(int a, int b){
        int mul = a*b;
        return mul;
    }
    //factorial
    public static int factorial(int n){
       int fact = 1;
       for(int i=1; i<=n; i++){
           fact*=i;
       }
       return fact;
    }

    public static float binomialCoff(int n, int r){
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        float bCoff = factN/(factR* factNR) ;
        return bCoff;
    }
    public static void main(String[] args) {
    int a = 3;
    int b= 9;
//        System.out.println(multiply(a,b));
//        System.out.println(factorial(7));
        System.out.println(binomialCoff(5,2));
    }
}
