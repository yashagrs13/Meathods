import java.util.Scanner;

public class SchoolGradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        System.out.print("Enter the Number of Students to check the Results : ");
        int numberOfStudent = sc.nextInt();
        for (int i = 1; i <= numberOfStudent; i++) {
            System.out.print("-------- Student " + i + " ----------- \n");
            for (int j = 1; j <= 3; j++) {
                System.out.print("Enter the marks of Subject " + j + " : ");
                int marks = sc.nextInt();
                totalMarks += marks;
            }
            String result = determineResult(totalMarks);
            System.out.print("The Result of Student " + i + " is : " + result + "\n");
            System.out.println();
        }
        sc.close();
    }

    static String determineResult(int totalMarks) {
        if (totalMarks >= 250) {
            return "pass";
        } else {
            return "Fail";
        }
    }
}