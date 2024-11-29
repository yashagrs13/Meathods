import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of trips taken : ");
        int noOftrips = sc.nextInt();

        for (int i = 1; i <= noOftrips; i++) {
            System.out.println("     --------- Trip " + i + " ----------    ");
            System.out.print("Enter the Distance travelled for Trip " + i + " : ");
            int distance = sc.nextInt();
            System.out.print("Enter the Fuel consumed for Trip " + i + " : ");
            int fuelConsumed = sc.nextInt();
            int mileage = calculateFuelEfficiency(distance, fuelConsumed);
            System.out.println("Mileage for Trip " + i + " is : " + mileage + " Km/ltr\n");
        }
        sc.close();
    }
    static int calculateFuelEfficiency(int distance, int fuelConsumed) {
        return distance / fuelConsumed;
    }
}