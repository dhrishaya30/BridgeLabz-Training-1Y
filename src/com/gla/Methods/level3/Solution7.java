
import java.util.Scanner;
import java.util.Arrays;

public class Solution7 {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[idx++] = i;
        }
        return factors;
    }
    
    public static int findGreatestFactor(int[] factors) {
        // Greatest factor besides itself usually, but prompt just says "greatest factor".
        // The array is sorted naturally by algorithm, so last element is n.
        // Assuming "greatest factor beside itself" based on context or just greatest.
        // I will return the largest in the array which is the number itself.
        // Or if prompt implies proper factor? I'll return the max value.
        return factors[factors.length - 1];
    }
    
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    
    public static long productFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }
    
    public static double productCubeFactors(int[] factors) {
        double prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productCubeFactors(factors));
        scanner.close();
    }
}
