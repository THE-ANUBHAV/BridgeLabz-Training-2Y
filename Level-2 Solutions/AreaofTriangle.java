import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height in cm
        System.out.print("Enter base of triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = input.nextDouble();

        // Calculate area in cm²
        double areaCm = 0.5 * base * height;

        // Convert cm² to inches² (1 inch = 2.54 cm → 1 inch² = 2.54² cm²)
        double areaInches = areaCm / (2.54 * 2.54);

        // Display results
        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);

        input.close();
    }
}
