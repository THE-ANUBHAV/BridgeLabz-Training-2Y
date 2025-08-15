import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN; // Avoid division by zero

        // Output results
        System.out.println("The addition of " + number1 + " and " + number2 + " is " + addition);
        System.out.println("The subtraction of " + number1 + " and " + number2 + " is " + subtraction);
        System.out.println("The multiplication of " + number1 + " and " + number2 + " is " + multiplication);
        if (number2 != 0) {
            System.out.println("The division of " + number1 + " and " + number2 + " is " + division);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        input.close();
    }
}
