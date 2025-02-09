public class SimpleArray {

    public static void main(String[] args) {
        // a. Populate an array with the sequence 1, 4, 9, 16, 25, 36, 49, 64, 81, 0
        int[] arr = new int[10];
        int i = 0;
        int num = 1;

        // Using do-while loop to fill the array with squares
        do {
            arr[i] = num * num;  // Store squares of 1, 2, 3, ...
            i++;
            num++;
        } while (i < 10);  // Loop until the array is fully populated

        // b. Sum the odd numbers and skip even numbers using a while loop
        int sum = 0;
        int j = 0;
        
        while (j < arr.length) {
            if (arr[j] == 81) {
                break;  // Stop when 81 is encountered
            }
            if (arr[j] % 2 != 0) {  // Check if the number is odd
                sum += arr[j];  // Add to sum if it's odd
            }
            j++;
        }

        // c. Display the sum of odd numbers
        System.out.println("Sum of odd numbers before encountering 81: " + sum);
    }
}
