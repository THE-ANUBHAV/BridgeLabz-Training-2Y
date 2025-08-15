import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input base and height in inches
        System.out.print("Enter base of the triangle in inches: ");
        double baseInches = input.nextDouble();

        System.out.print("Enter height of the triangle in inches: ");
        double heightInches = input.nextDouble();

        // Calculate area in square inches
        double areaInches = 0.5 * baseInches * heightInches;

        // Convert to square centimeters (1 inch = 2.54 cm, so 1 sq inch = 6.4516 sq cm)
        double areaCm = areaInches * 6.4516;

        // Output
        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");
    }
}

