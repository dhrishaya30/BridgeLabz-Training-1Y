
import java.util.Scanner;

public class Solution3 {
    public static double calculateRounds(double side1, double side2, double side3, double totalDistanceMeters) {
        double perimeter = side1 + side2 + side3;
        return totalDistanceMeters / perimeter;
    }

    public static void main(String[] args) {
        // Solution 3: Athlete Rounds for 5km
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangular park (in meters):");
        double s1 = scanner.nextDouble();
        double s2 = scanner.nextDouble();
        double s3 = scanner.nextDouble();
        
        double rounds = calculateRounds(s1, s2, s3, 5000); // 5km = 5000m
        
        System.out.println("Number of rounds to complete 5km run: " + Math.ceil(rounds)); // Using ceil to be safe, or just raw value
        // Note: Problem asks "how many rounds", usually implies whole rounds depending on context, or exact fraction.
        // I'll print exact value and maybe approximate.
        System.out.printf("Exact rounds: %.2f\n", rounds);
        scanner.close();
    }
}
