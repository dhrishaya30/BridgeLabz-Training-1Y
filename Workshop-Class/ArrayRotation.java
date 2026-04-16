public class ArrayRotation {
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;

        // Left Rotation
        for (int i = 0; i < k; i++) {
            int first = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = first;
        }

        // Print Result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}