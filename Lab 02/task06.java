import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String result = (age >= 18) ? "You are eligible for voting." : "You are not eligible for voting.";
        
        System.out.println(result);

        scanner.close();
    }
}
