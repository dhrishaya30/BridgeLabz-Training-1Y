
public class Solution6 {
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    
    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }
    
    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }
    
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Solution 6: Unit Converter Temp/Weight/Volume
        System.out.println("32 F to C: " + convertFahrenheitToCelsius(32));
        System.out.println("0 C to F: " + convertCelsiusToFahrenheit(0));
        System.out.println("10 Lbs to Kg: " + convertPoundsToKg(10));
        System.out.println("10 Kg to Lbs: " + convertKgToPounds(10));
        System.out.println("10 Gallons to Liters: " + convertGallonsToLiters(10));
        System.out.println("10 Liters to Gallons: " + convertLitersToGallons(10));
    }
}
