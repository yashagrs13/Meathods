import java.util.Scanner;

public class CafeDiscountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Items Purchased : ");
        int numberOfItems = sc.nextInt();
        double totalPrice = 0;
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter the price of item " + i + " : ");
            double price = sc.nextDouble();
            totalPrice += price;
        }
        System.out.println("Total price before discount is : " + totalPrice);
        double discountPrice = applyDiscount(totalPrice);
        System.out.print("The final amount of the Customer after discount(if applicable) is : " + discountPrice);
        sc.close();
    }

    static double applyDiscount(double totalPrice) {
        double finalPrice = 0;
        if (totalPrice <= 500) {
            finalPrice = totalPrice;
        }
        if (totalPrice > 500 && totalPrice <= 1000) {
            finalPrice = totalPrice - (totalPrice * 0.05);
        }
        if (totalPrice > 1000) {
            finalPrice = totalPrice - (totalPrice * 0.1);
        }
        return finalPrice;
    }
}