
import java.util.Scanner;

public class Solution1 {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Solution 1: Simple Interest
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();
        
        double interest = calculateSimpleInterest(principal, rate, time);
        
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
        scanner.close();
    }
}
