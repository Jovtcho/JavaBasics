import java.util.Scanner;

public class P07GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number1 = Integer.parseInt(console.nextLine());
        int number2 = Integer.parseInt(console.nextLine());

        while (number2 != 0) {
            int tempNumber = number2;
            number2 = number1 % number2;
            number1 = tempNumber;
        }

        System.out.println(number1);
    }
}