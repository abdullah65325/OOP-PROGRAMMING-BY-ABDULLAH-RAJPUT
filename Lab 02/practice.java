public class MatrixCheck {

    public static void main(String[] args) {
        // Define the matrix
        int[][] matrix = {
            {1, 1, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 1}
        };

        // Check if the matrix contains the letter 'N'
        if (matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[1][0] == 1 &&
            matrix[1][2] == 1 && matrix[2][0] == 1 && matrix[2][3] == 1 &&
            matrix[3][0] == 1 && matrix[3][4] == 1) {
            System.out.println("The matrix contains the letter 'N'.");
        } else {
            System.out.println("The matrix does not contain the letter 'N'.");
        }
    }
}
