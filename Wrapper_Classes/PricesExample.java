import java.util.ArrayList;

public class PricesExample {
    public static void main(String[] args) {

        // Given array
        double[] prices = {10.5, 20.0, 35.75, 5.5};

        // Convert to ArrayList<Double> (Auto-boxing)
        ArrayList<Double> list = new ArrayList<>();
        for (double price : prices) {
            list.add(price);  // double → Double
        }

        // Finding highest price
        double max = list.get(0);
        double sum = 0;

        for (Double price : list) {
            if (price > max) {
                max = price;
            }
            sum += price;  // Auto-unboxing
        }

        // Calculating average
        double avg = sum / list.size();

        // Printing results
        System.out.println("Highest price = " + max);
        System.out.println("Average price = " + avg);
    }
}