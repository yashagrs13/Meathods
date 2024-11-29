import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of families booking tickets : ");
        int noOfFamilies = sc.nextInt();

        for (int i = 1; i <= noOfFamilies; i++) {
            System.out.println("\n  ------ Family " + i + " -------- ");
            System.out.print("Enter the number of Adult tickets : ");
            int adulttickets = sc.nextInt();
            System.out.print("Enter the number of Children tickets : ");
            int childTickets = sc.nextInt();

            int totalCost = calculateTicketCost(adulttickets, childTickets);
            System.out.print("Total Price for " + adulttickets + " Adult tickets and " + childTickets + " Child tickets is : " + totalCost + " Rs.\n");
        }
        sc.close();
    }

    static int calculateTicketCost(int adulttickets, int childTickets) {

        final int adultTicketPrice = 300;
        final int childTicketPrice = 200;

        int totalCost = (adulttickets * adultTicketPrice) + (childTickets * childTicketPrice);
        return totalCost;
    }
}