package StringQuestions;

public class StringBasic {

    public static void main(String[] args) {

        // Creating a string "Hello" and assigning it to str1 (stored in the string pool in the heap)
        String str1 = "Hello";

        // Creating another string "Hello" (refers to the same object in the string pool)
        String str3 = "Hello"; // Due to string interning, it refers to the same object in the string pool

        String str7 = "Hello";

        String str6 = new String("Hello").intern();
        String str8 = new String("Hello");

        // Concatenating "World" to str1 and assigning it to str2
        String str2 = str1 + " World"; // New string created and stored in the heap

        // Converting str1 to uppercase and assigning it to str1
        str1 = str1.toUpperCase();// New string created and stored in the heap

        String str4 = str3.concat("hi");
        //in heap memory

        String str5 = new String("hello everyone");
        //in heap memory



        // Outputting the values of str1, str2, and str3
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str7 == str3);
        System.out.println(str3 == str6);
        System.out.println("check value = "+ str8.equals(str7));


        String reversed_sBuilder = new StringBuilder("hungryCoders").reverse().toString();
        System.out.println(reversed_sBuilder); //sredoCyrgnuh
        String reversed_sBuffer = new StringBuffer("hungryCoders").reverse().toString();
        System.out.println(reversed_sBuffer); //sredoCyrgnuh

        String formattedString = String.format("Hello, %s! Welcome to %s.", "Friend", "HungryCoders.com");
        System.out.println(formattedString); //Hello, Friend! Welcome to HungryCoders.com.
    }
}
