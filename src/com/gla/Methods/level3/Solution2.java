
import java.util.Scanner;
import java.util.Arrays;

public class Solution2 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    
    public static boolean isDuckNumber(int[] digits) {
        // Algorithm: Check if any digit is 0. 
        // Note: Strict definition says "no zero at beginning", but integers don't have leading zeros usually.
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }
    
    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }
    
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int d : digits) {
            if (d > max) {
                secondMax = max;
                max = d;
            } else if (d > secondMax && d != max) {
                secondMax = d;
            }
        }
        return new int[]{max, secondMax};
    }
    
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        for (int d : digits) {
            if (d < min) {
                secondMin = min;
                min = d;
            } else if (d < secondMin && d != min) {
                secondMin = d;
            }
        }
        return new int[]{min, secondMin};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(number, digits));
        
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
        
        scanner.close();
    }
}
