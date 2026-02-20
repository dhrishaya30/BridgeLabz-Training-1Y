
public class Solution11 {
    public static double[][] calculateBonus(double[][] data) {
        double[][] newData = new double[data.length][3]; // Salary, Bonus, New Salary
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            newData[i][0] = salary;
            newData[i][1] = bonus;
            newData[i][2] = salary + bonus;
        }
        return newData;
    }
    
    public static void displayData(double[][] result) {
        System.out.println("Old Salary\tBonus\t\tNew Salary");
        double totalBonus = 0;
        double totalOld = 0;
        double totalNew = 0;
        
        for (double[] row : result) {
            System.out.printf("%.2f\t%.2f\t%.2f\n", row[0], row[1], row[2]);
            totalOld += row[0];
            totalBonus += row[1];
            totalNew += row[2];
        }
        System.out.println("----------------------------------------");
        System.out.printf("%.2f\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        // Generate random data
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + Math.random() * 90000; // Salary
            data[i][1] = Math.random() * 10; // Years
        }
        
        double[][] result = calculateBonus(data);
        displayData(result);
    }
}
