import java.util.Scanner;

public class StepCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = new int[5];
        System.out.println("Enter the steps walked in 5 days ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the Steps for day " + (i + 1) + " : ");
            days[i] = sc.nextInt();
        }
        System.out.println();
        int calories = stepsToCalories(days);
        System.out.print("\nTotal Calories burned in 5 days is : " + calories);
        sc.close();
    }

    static int stepsToCalories(int[] days) {
        int totalSteps = 0;
        for (int step: days) {
            totalSteps += step;
        }
        for (int i = 0; i < 5; i++) {
            int caloriePerDay = days[i] / 20;

            System.out.println("Calories burned for day " + (i + 1) + " is : " + caloriePerDay);
        }

        System.out.print("\nTotal steps taken in 5 days is : " + totalSteps);
        int totalCalories = totalSteps / 20;
        return totalCalories;
    }
}