
public class Solution5 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3.0;
    }
    
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        // Solution 5: Unit Converter Extended
        System.out.println("10 Yards to Feet: " + convertYardsToFeet(10));
        System.out.println("10 Feet to Yards: " + convertFeetToYards(10));
        System.out.println("10 Meters to Inches: " + convertMetersToInches(10));
        System.out.println("10 Inches to Meters: " + convertInchesToMeters(10));
        System.out.println("10 Inches to Cm: " + convertInchesToCm(10));
    }
}
