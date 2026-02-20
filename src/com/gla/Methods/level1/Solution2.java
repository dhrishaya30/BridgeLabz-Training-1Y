
import java.util.Scanner;

public class Solution2 {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        // Solution 2: Max Handshakes
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int handshakes = calculateHandshakes(numberOfStudents);
        
        System.out.println("Maximum number of possible handshakes: " + handshakes);
        scanner.close();
    }
}
