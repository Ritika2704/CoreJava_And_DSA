package homework;

import java.util.Locale;
import java.util.Scanner;
//15.Write a program that asks the user to enter a string and counts the number of vowels (a, e, i, o, u) in the string.
public class VowelPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lower case to handle both upper and lower case vowels
        inputString = inputString.toLowerCase();

        // Initialize the vowel count to 0
        int vowelCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Print the number of vowels
        System.out.println("The number of vowels in the string is: " + vowelCount);
    }
}






//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter value ");
//        String stringVal = sc.nextLine();
//
//        stringVal = stringVal.toLowerCase();
//        int count =0;
//        for(int i=0; i<=stringVal.length(); i++){
//            char ch = stringVal.charAt(i);
//            if(ch == 'a' || ch =='e' || ch == 'i' ||ch == 'o'|| ch =='u'){
//               count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
