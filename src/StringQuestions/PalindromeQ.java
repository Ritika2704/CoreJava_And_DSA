package StringQuestions;

public class PalindromeQ {

    public boolean PalindromePrint(String str ){
        int n = str.length();
        for(int i =0; i< n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
     String str = "noon";
     PalindromeQ p = new PalindromeQ();
        System.out.println(p.PalindromePrint(str));
    }
}


















//public class PalindromeQ {
//     public boolean printPalindrome(String str){
//         int i = 0;
//         int j = str.length()-1;
//         while(i<j){
//             if(str.charAt(i)!= str.charAt(j)){
//               return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
//    public static void main(String[] args) {
//        String str = "racecar";
//        PalindromeQ p = new PalindromeQ();
//        System.out.println(p.printPalindrome(str));
//    }
//}
