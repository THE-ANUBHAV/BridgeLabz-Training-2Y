import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Converting to inches
        double totalInches = heightCm / 2.54;

        // Calculating feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Output
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + String.format("%.2f", inches));
    }
}
