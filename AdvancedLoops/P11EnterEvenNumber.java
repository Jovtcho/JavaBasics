import java.util.Scanner;

public class P11EnterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isValid;
        String str;

        do {
            isValid = true;
            System.out.print("Enter even number: ");
            str = console.nextLine();
            if (isInteger(str)) {
                int number = Integer.parseInt(str);
                if (number % 2 != 0) {
                    isValid = false;
                    System.out.println("The number is not even.");
                }
            } else {
                System.out.println("Invalid number!");
                isValid = false;
            }
        } while (!isValid);
        System.out.printf("Even number entered: %s", str);
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
