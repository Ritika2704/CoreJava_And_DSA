package RevisionDSABasic;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.printPalindrome(123));

    }

    public boolean printPalindrome(int n){
        int actual = n;
        int rev =0;

        while(n>0){
            int Last = n%10;
            rev = (rev*10)+Last;
            n= n/10;
        }
        if (actual == rev){
            return true;
        }
        return false;
    }
}
