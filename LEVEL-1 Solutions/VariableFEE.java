import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculations
        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;

        // Output
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);
    }
}
