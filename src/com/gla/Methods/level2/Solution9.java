
import java.util.Scanner;

public class Solution9 {
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        // Solution 9: Number Analysis
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) System.out.println("Even");
                else System.out.println("Odd");
            } else {
                System.out.println(num + " is Negative");
            }
        }
        
        int comparison = compare(numbers[0], numbers[4]);
        System.out.println("Comparing first (" + numbers[0] + ") and last (" + numbers[4] + "): " + comparison);
        // (1 = Greater, 0 = Equal, -1 = Smaller)
        
        scanner.close();
    }
}
