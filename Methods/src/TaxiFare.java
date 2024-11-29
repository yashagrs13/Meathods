import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rides to Calculate the fair : ");
        int numberOfRides = sc.nextInt();
        for (int i = 1; i <= numberOfRides; i++) {
            System.out.print("Enter the distance travelled by Customer " + i + " in (kms) : ");
            int distance = sc.nextInt();
            int fare = calculateFare(distance);
            System.out.print("Total fare of Customer " + i + " is : " + fare + "\n");
        }
        sc.close();
    }

    static int calculateFare(int distance) {
        if (distance <= 1) {
            return 50;
        } else {
            return 50 + ((distance - 1) * 15);
        }
    }
}