
public class Solution5 {
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3) {
            return day >= 20 && day <= 31;
        } else if (month == 4 || month == 5) {
            return day >= 1 && day <= 31;
        } else if (month == 6) {
            return day >= 1 && day <= 20;
        }
        return false;
    }

    public static void main(String[] args) {
        // Solution 5: Spring Season
        if (args.length < 2) {
            System.out.println("Please provide month and day as arguments.");
            return;
        }
        
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
