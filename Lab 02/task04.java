import java.util.Scanner;

public class arraycHeckerstring {
    public static void main(String[] args) {

        String[] names = new String[6];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 names:");

        for (int i = 0; i < 6; i++) {
            names[i] = scanner.nextLine();
        }

      boolean nameOK = false;
        for (int i = 0; i < 6; i++) {
            if (names[i].equalsIgnoreCase("Ali")) {
                nameOK = true;
            }
        }

      if (nameOK) {
            System.out.println("Yes, Ali is in the array.");
        } else {
            System.out.println("No, Ali is not in the array.");
        }

        scanner.close();
    }
}
