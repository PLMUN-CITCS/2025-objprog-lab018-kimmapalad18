import java.util.Scanner;

public class EvenOrOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {  // loop twice for two inputs
            int number = getIntegerInput(scanner);
            String result = checkEvenOrOdd(number);
            System.out.println(result + "\n");
        }
    }

    public static int getIntegerInput(Scanner scanner) {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // consume the invalid input
            System.out.print("Enter an integer: ");
        }
        return scanner.nextInt();
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}