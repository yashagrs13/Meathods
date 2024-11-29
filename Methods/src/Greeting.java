import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the Person : ");
        String name = sc.nextLine();

        System.out.print("Enter the time of the day in (Morning, Afternoon, Evening ) : ");
        String timeOfDay = sc.nextLine();

        String greeting = generateGreeting(name, timeOfDay);
        System.out.println(greeting);
        sc.close();
    }

    static String generateGreeting(String name, String timeOfDay) {
        String message = "Good " + timeOfDay + " " + name;
        return message;
    }
}