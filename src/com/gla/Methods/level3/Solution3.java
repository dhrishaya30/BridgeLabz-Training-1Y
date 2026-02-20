
import java.util.Scanner;

public class Solution3 {
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }
    
    public static int sumSquaresDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }
    
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumDigits(digits);
        return sum > 0 && number % sum == 0;
    }
    
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i; // Digits 0-9
        
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] digits = storeDigits(number);
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumSquaresDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));
        
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] row : freq) {
            if (row[1] > 0) {
                System.out.println("Digit " + row[0] + ": " + row[1]);
            }
        }
        scanner.close();
    }
}
