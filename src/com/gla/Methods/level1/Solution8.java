
import java.util.Scanner;

public class Solution8 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Solution 8: Quotient and Remainder
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int number = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        
        if (divisor == 0) {
            System.out.println("Division by zero not allowed.");
            return;
        }
        
        int[] result = findRemainderAndQuotient(number, divisor);
        
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        scanner.close();
    }
}
