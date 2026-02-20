
import java.util.Scanner;

public class Solution9 {
    // Reusing the method signature concept from Q8 as requested
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Chocolates per child
        int remainder = number % divisor; // Remaining chocolates
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Solution 9: Chocolate Division
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();
        
        if (children == 0) {
            System.out.println("No children to distribute to.");
            return;
        }
        
        int[] result = findRemainderAndQuotient(chocolates, children);
        
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
        scanner.close();
    }
}
