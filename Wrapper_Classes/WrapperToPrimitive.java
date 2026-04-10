public class WrapperToPrimitive {
    public static void main(String[] args) {

        // Given Double object
        Double obj = 45.67;

        // Converting to primitive double (Unboxing)
        double d = obj;

        // Converting to primitive int (using casting)
        int i = (int) d;

        // Printing values
        System.out.println("Double object: " + obj);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive int (after casting): " + i);
    }
}