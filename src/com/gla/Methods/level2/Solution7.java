
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        // Solution 7: Student Vote Checker
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        StudentVoteChecker checker = new StudentVoteChecker();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        System.out.println("\nVoing Eligibility:");
        for (int i = 0; i < 10; i++) {
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): Cannot Vote");
            }
        }
        scanner.close();
    }
}

class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
}
