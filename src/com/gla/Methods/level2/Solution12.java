
import java.util.Arrays;

public class Solution12 {
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Solution 12: Random Number Stats
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        System.out.print("Generated Numbers: ");
        for (int num : randomNumbers) System.out.print(num + " ");
        System.out.println();
        
        double[] stats = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + stats[0]);
        System.out.println("Min: " + (int)stats[1]);
        System.out.println("Max: " + (int)stats[2]);
    }
}
