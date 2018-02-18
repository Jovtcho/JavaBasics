import java.util.Scanner;

public class P06NumberInRange {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        boolean isValid;

        do {
            isValid = true;
            System.out.print("Еnter a number in the range [1...100]: ");
            number = Integer.parseInt(console.nextLine());
            if (number < 1 || number > 100) {
                isValid = false;
                System.out.println("Invalid number!");
            }
        } while (!isValid);

        System.out.printf("The number is: %d", number);
    }
}