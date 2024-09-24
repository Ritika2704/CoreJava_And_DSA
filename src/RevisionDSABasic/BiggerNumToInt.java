package RevisionDSABasic;


//2345 -> 2,3,4,5
public class BiggerNumToInt {
    public static void main(String[] args) {
        Function(2345);
    }

    public static void Function(int n){
        int div= 1;
        int copy =n;
        while(copy>=10){
            copy = copy/div;
            div = div*10;
        }
        while(div>0){
            int digit = n/div;
            System.out.println(digit);
            n= n%div;
            div = div/10;
        }

    }
}
