import java.util.Scanner;

public class AlphaConstCHeker {
    public static void main(String[] args) {
      
        char[] constants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        boolean cheker = false;
        for (int i = 0; i < constants.length; i++) {
            if (constants[i] == input) {
                cheker = true;
                break;
            }
        }

        if (cheker) {
            System.out.println("Yes, " + input + " is a consonant.");
        } else {
            System.out.println("No, " + input + " is not a consonant.");
        }
    }
}
