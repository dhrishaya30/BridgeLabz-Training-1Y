
import java.util.Scanner;

public class Solution11 {
    public static double[] calculateTrigonometricFunctions(double angleDegree) {
        double radians = Math.toRadians(angleDegree);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // Solution 11: Trigonometric Functions
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        
        double[] results = calculateTrigonometricFunctions(angle);
        
        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);
        scanner.close();
    }
}
