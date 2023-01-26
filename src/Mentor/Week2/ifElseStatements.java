import java.util.Scanner;

public class ifElseStatements {

    public static void main(String[] args) {

        int  score;    // To hold a test score
        char grade;    // To hold a letter grade

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get the test score.
        System.out.print("Enter your numeric test score : ");
        score = console.nextInt();

        // Calculate the grade.
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 50) {
            System.out.println("D");
        } else {
            grade = 'F';
        }

        // Display the grade.
        System.out.println("Your grade is " + score);
    }
}
