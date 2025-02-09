
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range from the user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        // Loop through all numbers in the range
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number other than 1 and itself
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If num is not divisible by any number, it's prime
            if (isPrime && num > 1) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
