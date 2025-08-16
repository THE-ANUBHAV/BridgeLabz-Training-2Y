import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input in feet
        System.out.print("Enter the distance in feet: ");
        int distanceInFeet = input.nextInt();

        // Conversion
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;

        // Output
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
