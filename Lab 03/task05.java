/*
@Developer: Danish Ali
@Date: 31-01-2025
*/
import java.util.Scanner;

public class SimpleSeatReservation {

    public static void main(String[] args) {
        // Create a small 2D array for a 3x3 theater (3 rows, 3 columns)
        boolean[][] seats = {
            {false, false, false},  // Row 1 (false = available)
            {false, false, false},  // Row 2
            {false, false, false}   // Row 3
        };
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Display the menu
            System.out.println("1. Display available seats");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display available seats
                    for (int i = 0; i < seats.length; i++) {
                        for (int j = 0; j < seats[i].length; j++) {
                            if (seats[i][j]) {
                                System.out.print("R "); // Reserved seat
                            } else {
                                System.out.print("A "); // Available seat
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Ask for row and column to reserve
                    System.out.print("Enter row number (1-3): ");
                    int row = scanner.nextInt() - 1;  // Convert to 0-based index
                    System.out.print("Enter column number (1-3): ");
                    int col = scanner.nextInt() - 1;  // Convert to 0-based index

                    // Check if the seat is available or already reserved
                    if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                        System.out.println("Invalid row or column.");
                    } else if (seats[row][col]) {
                        System.out.println("Seat already reserved.");
                    } else {
                        seats[row][col] = true;  // Reserve the seat
                        System.out.println("Seat reserved successfully.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }
        } while (choice != 3);
        
        scanner.close();
    }
}
