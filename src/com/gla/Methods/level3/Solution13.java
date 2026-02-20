
import java.util.Scanner;

public class Solution13 {
    public static double[][] calculateScores(double[][] marks) {
        double[][] results = new double[marks.length][4]; // Total, Avg, Perc, dummy
        // Prompt asks for 2D array with values.
        // Let's return Total, Avg, Percentage.
        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3;
            double perc = total / 300 * 100; // Assuming 100 per subject
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = perc;
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        double[][] marks = new double[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = 10 + Math.random() * 90; // Physics
            marks[i][1] = 10 + Math.random() * 90; // Chem
            marks[i][2] = 10 + Math.random() * 90; // Math
        }
        
        double[][] results = calculateScores(marks);
        
        System.out.println("Total\tAverage\tPercentage");
        for (double[] row : results) {
            System.out.printf("%.2f\t%.2f\t%.2f\n", row[0], row[1], row[2]);
        }
        scanner.close();
    }
}
