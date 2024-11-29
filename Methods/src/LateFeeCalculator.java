import java.util.Scanner;

public class LateFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Customers for whom you need to calculate late fee : ");
        int customers = sc.nextInt();

        for (int i = 1; i <= customers; i++) {
            System.out.print("Enter the number of late fee days for Customer " + i + " : ");
            int noOfLateDays = sc.nextInt();
            int lateFeePerDay = 100;
            int fine = calculateLateFee(noOfLateDays, lateFeePerDay);
            System.out.println("The total fine of Customer " + i + " is : " + fine);
        }
        sc.close();
    }

    static int calculateLateFee(int noOfLateDays, int lateFeePerDay) {
        int totalfee = noOfLateDays * lateFeePerDay;
        return totalfee;
    }
}