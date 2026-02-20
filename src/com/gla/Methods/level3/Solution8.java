
import java.util.Arrays;

public class Solution8 {
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
    
    public static boolean areUnique(int[] otps) {
        Arrays.sort(otps);
        for (int i = 0; i < otps.length - 1; i++) {
            if (otps[i] == otps[i+1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Solution 8: OTP Generation and Uniqueness Check
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All unique? " + areUnique(otps));
    }
}
