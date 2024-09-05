package functions;

public class avgOfNums {
    public static void printAvg(int a, int b, int c){
        float avg = (a+b+c)/3;
        System.out.println(avg);
    }

    public static boolean isEven(int n){
        if(n%2 ==0){
            return true;
        }
        return false;
    }

    public static void palindrome(int n){
       int actualnum = n;
       int palinNum =0;

       while(n !=0){
           int lastdig = n%10;
           palinNum = palinNum*10 + lastdig;
           n= n/10;
       }
       if(actualnum == palinNum){
        System.out.println(actualnum +" is palindrome");}
       else {
           System.out.println(actualnum +" is not palindrome");}

    }
    public static void main(String[] args) {
        int a = 4;
//        int b=6;
//        int c=9;
//        printAvg(a,b,c);
//        System.out.println(a +" is Even? = " + isEven(a));
        palindrome(123);
    }
}
