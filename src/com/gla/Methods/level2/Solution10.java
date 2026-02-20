
import java.util.Scanner;

public class Solution10 {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        // Solution 10: BMI for 10 members
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // Weight, Height, BMI
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }
        
        calculateBMI(data);
        String[] statuses = getBMIStatus(data);
        
        System.out.println("\nResults:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Member %d: Height=%.1f cm, Weight=%.1f kg, BMI=%.2f, Status=%s\n", 
                              (i + 1), data[i][1], data[i][0], data[i][2], statuses[i]);
        }
        scanner.close();
    }
}
