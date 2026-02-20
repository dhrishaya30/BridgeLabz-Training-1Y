
import java.util.Scanner;

public class Solution4 {
    public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        // Solution 4: Pos/Neg/Zero check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = checkNumber(number);
        System.out.println("Result (1=Pos, -1=Neg, 0=Zero): " + result);
        
        if (result == 1) System.out.println("Positive Number");
        else if (result == -1) System.out.println("Negative Number");
        else System.out.println("Zero");
        
        scanner.close();
    }
}
