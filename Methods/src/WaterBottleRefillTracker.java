import java.util.Scanner;

public class WaterBottleRefillTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalNoOfBottles = 0;
        double intakePerDay = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter the number of Bottle drank in day " + i + " :");
            int noOfBottles = sc.nextInt();
            intakePerDay = calculateWaterIntake(noOfBottles);
            System.out.println("Water intake on Day " + i + " is : " + intakePerDay + " litres.\n");
            totalNoOfBottles += noOfBottles;
        }
            double totalVolume = totalNoOfBottles * 0.5;
            System.out.println("The total water intake of the person in a week is " + totalVolume + " litres ");
        sc.close();
    }
    static double calculateWaterIntake(int noOfBottles) {
        return (noOfBottles * 0.5);
    }
}