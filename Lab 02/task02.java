import java.util.Scanner;

public class ArrayMulti {
    public static void main(String[] args) {

      int[] array = new int[10];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integer values:");

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (array[i] % 4 == 0) {
                sum += array[i];
            }
        }

        System.out.println("The sum of multiples of 4 is: " + sum);
    }
}
