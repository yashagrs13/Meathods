import java.util.Scanner;

public class RestaurantBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Customers : ");
        int customers = sc.nextInt();

        for (int i = 1; i <= customers; i++) {
            System.out.println("\n----------- Customer " + i + " ----------- ");
            System.out.print("Enter the number of food items : ");
            int items = sc.nextInt();

            double[] prices = new double[items];
            for (int j = 0; j < items; j++) {
                System.out.print("Enter the price of item " + (j + 1) + " : ");
                prices[j] = sc.nextDouble();
            }
            double totalBill = calculateTotalBill(prices);
            System.out.printf("The total bill of Customer %d including a 10%% service charge is : Rs%.2f%n", i, totalBill);
        }
        sc.close();
    }
    static double calculateTotalBill(double...prices) {
        double total = 0;
        for (double price: prices) {
            total += price;
        }
        double serviceCharge = total * .10;
        total = total + serviceCharge;
        return total;
    }
}