
public class Solution1 {
    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }
    
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }
    
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int i : arr) min = Math.min(min, i);
        return min;
    }
    
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int i : arr) max = Math.max(max, i);
        return max;
    }

    public static void main(String[] args) {
        // Solution 1: Football Team Heights
        int[] heights = new int[11];
        
        System.out.print("Heights: ");
        for (int i = 0; i < 11; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // 150 to 250
            System.out.print(heights[i] + " ");
        }
        System.out.println();
        
        System.out.println("Sum: " + sum(heights));
        System.out.printf("Mean: %.2f\n", mean(heights));
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
    }
}
