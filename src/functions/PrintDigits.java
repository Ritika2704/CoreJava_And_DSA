package functions;

public class PrintDigits {
    public static void main(String[] args) {
        int number = 4567;
        int divisor = 1;

        // Calculate the divisor as the highest power of 10 less than or equal to the number
        while (number / divisor >= 10) {
            divisor *= 10;
        }

        // Print each digit on a new line
        while (divisor > 0) {
            int digit = number / divisor;  // Extract the leading digit
            System.out.println(digit);
            number %= divisor;  // Remove the leading digit
            divisor /= 10;      // Reduce the divisor by a factor of 10
        }
    }
}

