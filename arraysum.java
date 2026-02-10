import java.util.Scanner;

class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int sum = 0;
        int arr[] = new int[n];

        System.out.println("Enter the elements of 1D array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("The sum of the given array is: " + sum);
    }
}
