import java.util.Scanner;

public class FindSmallestAndLargest {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest element is: " + smallest);
        System.out.println("Largest element is: " + largest);

        if (largest % 2 == 0) {
            System.out.println("The largest element is a multiple of 2.");
        } else {
            System.out.println("The largest element is not a multiple of 2.");
        }

        scanner.close();
    }
}
