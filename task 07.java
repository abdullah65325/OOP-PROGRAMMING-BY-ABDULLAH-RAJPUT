import java.util.Scanner;

public class CylinderVolumeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Prompt user for height
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate volume
        double volume = calculateVolume(radius, height);

        // Display result
        System.out.printf("The volume of the cylinder is: %.2f cubic units%n", volume);

        scanner.close();
    }
   /**
     * Calculates the volume of a cylinder given its radius and height.
     *
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     * @return the volume of the cylinder
     */
    public static double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
