package homework;

//2.Write a program that converts a double value to an integer and prints both the original and converted values.
public class DoubleToInt {
    public static void main(String[] args) {
        double value = 23.45;
        int convertedValue = (int)value;

        System.out.println("Original value: "+ value);
        System.out.println("Converted value: "+ convertedValue);
    }
}
