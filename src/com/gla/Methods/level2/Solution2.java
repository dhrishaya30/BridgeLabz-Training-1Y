
import java.util.Scanner;

public class Solution2 {
    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }
    
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Solution 2: Sum using Recursion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Not a natural number.");
            return;
        }
        
        int recSum = sumRecursive(n);
        int formSum = sumFormula(n);
        
        System.out.println("Recursive Sum: " + recSum);
        System.out.println("Formula Sum: " + formSum);
        
        if (recSum == formSum) {
            System.out.println("Both computations are correct.");
        }
        scanner.close();
    }
}
