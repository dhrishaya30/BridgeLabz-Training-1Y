
import java.util.Scanner;

public class Solution10 {
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Formula: 35.74 + 0.6215 * T + (0.4275 * T - 35.75) * V^0.16
        // Note: Temperature should be in Fahrenheit and Wind Speed in mph for this standard NOAA formula
        // Assuming inputs are in valid units
        if (Math.abs(temperature) > 50 || windSpeed > 120 || windSpeed < 3) {
           // Standard formula validity limits, but we will just calculate as asked
        }
        
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        // Solution 10: Wind Chill
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature (F): ");
        double temp = scanner.nextDouble();
        System.out.print("Enter Wind Speed (mph): ");
        double speed = scanner.nextDouble();
        
        double windChill = calculateWindChill(temp, speed);
        
        System.out.println("Wind Chill Temperature: " + windChill);
        scanner.close();
    }
}
