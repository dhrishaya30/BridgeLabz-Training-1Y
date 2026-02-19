import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 90 + 10);
            scores[i][1] = (int)(Math.random() * 90 + 10);
            scores[i][2] = (int)(Math.random() * 90 + 10);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = avg;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        return result;
    }

    public static String[] calculateGrade(double[][] result) {
        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double p = result[i][2];

            if (p >= 90) grade[i] = "A+";
            else if (p >= 80) grade[i] = "A";
            else if (p >= 70) grade[i] = "B";
            else if (p >= 60) grade[i] = "C";
            else if (p >= 50) grade[i] = "D";
            else grade[i] = "F";
        }

        return grade;
    }

    public static void display(int[][] scores, double[][] result, String[] grade) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" +
                               scores[i][1] + "\t" +
                               scores[i][2] + "\t" +
                               result[i][0] + "\t" +
                               result[i][1] + "\t" +
                               result[i][2] + "\t" +
                               grade[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] result = calculateResults(scores);
        String[] grade = calculateGrade(result);

        display(scores, result, grade);

        sc.close();
    }
}
