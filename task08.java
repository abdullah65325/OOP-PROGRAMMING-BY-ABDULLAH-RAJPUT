import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the speed in miles per hour
        System.out.print("Enter speed in miles per hour: ");
        double milesPerHour = scanner.nextDouble();
        
        // Convert miles per hour to kilometers per hour
        double kilometersPerHour = milesPerHour * 1.60934;
        
        // Display the equivalent speed in kilometers per hour
        System.out.println(milesPerHour + " miles per hour is equal to " + kilometersPerHour + " kilometers per hour.");
        
        // Close the scanner
        scanner.close();
    }
}
