import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes using formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
