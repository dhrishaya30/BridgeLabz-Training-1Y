
import java.util.Scanner;

public class Solution6 {
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Solution 6: Sum of Natural Numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number.");
        } else {
            int sum = calculateSum(n);
            System.out.println("Sum of " + n + " natural numbers is " + sum);
        }
        scanner.close();
    }
}
