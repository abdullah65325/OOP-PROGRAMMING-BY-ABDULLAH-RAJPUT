/*
@Developer: Danish Ali
@Date: 31-01-2025
*/
public class MatrixOperations {

    public static void main(String[] args) {
        // Define the matrix
        int[][] matrix = {
            {12, 13, 15, 16},
            {11, 110, 121, 17},
            {17, 18, 100, 21}
        };

        // a. Divide each even number by 2 and store it in the same matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {  // Check if the number is even
                    matrix[i][j] /= 2;  // Divide the even number by 2
                }
            }
        }

        // b. Display the odd numbers from the matrix
        System.out.println("Odd numbers in the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {  // Check if the number is odd
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();  // Move to a new line after displaying odd numbers

        // c. Sum of the updated even numbers in the matrix
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {  // Check if the number is even
                    sum += matrix[i][j];  // Add the even number to the sum
                }
            }
        }

        // Display the sum of even numbers
        System.out.println("Sum of the updated even numbers: " + sum);
    }
}
