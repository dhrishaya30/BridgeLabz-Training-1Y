
import java.util.Scanner;

public class Solution8 {
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return getFriendName(index);
    }
    
    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return getFriendName(index);
    }
    
    private static String getFriendName(int index) {
        switch (index) {
            case 0: return "Amar";
            case 1: return "Akbar";
            case 2: return "Anthony";
            default: return "Unknown";
        }
    }

    public static void main(String[] args) {
        // Solution 8: Youngest and Tallest Friend
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height: ");
            heights[i] = scanner.nextDouble();
        }
        
        System.out.println("Youngest Friend: " + findYoungest(ages));
        System.out.println("Tallest Friend: " + findTallest(heights));
        scanner.close();
    }
}
