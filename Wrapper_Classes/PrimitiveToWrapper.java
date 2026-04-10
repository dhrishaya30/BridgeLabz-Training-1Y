import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking integer input from user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Converting primitive int to Integer object (Wrapper class)
        Integer obj = Integer.valueOf(num);  // Boxing

        // Displaying both values
        System.out.println("Primitive int value: " + num);
        System.out.println("Wrapper Integer object: " + obj);

        sc.close();
    }
}