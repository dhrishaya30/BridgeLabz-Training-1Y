public class WrapperUtilityMethods {
    public static void main(String[] args) {

        // parseInt
        int intValue = Integer.parseInt("123");

        // parseDouble
        double doubleValue = Double.parseDouble("3.14");

        // parseBoolean
        boolean boolValue = Boolean.parseBoolean("true");

        // toBinaryString
        String binaryValue = Integer.toBinaryString(10);

        // Character methods
        boolean isDigit = Character.isDigit('5');
        char upperChar = Character.toUpperCase('a');

        // Printing results
        System.out.println("Integer.parseInt(\"123\") = " + intValue);
        System.out.println("Double.parseDouble(\"3.14\") = " + doubleValue);
        System.out.println("Boolean.parseBoolean(\"true\") = " + boolValue);
        System.out.println("Integer.toBinaryString(10) = " + binaryValue);
        System.out.println("Character.isDigit('5') = " + isDigit);
        System.out.println("Character.toUpperCase('a') = " + upperChar);
    }
}