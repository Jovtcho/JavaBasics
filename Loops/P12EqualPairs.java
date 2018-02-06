import java.util.Scanner;

public class P12EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());

        int currentNumber1 = Integer.parseInt(scanner.nextLine());
        int currentNumber2 = Integer.parseInt(scanner.nextLine());
        int firstSum = currentNumber1 + currentNumber2;
        int checkDiff = 0;

        for (int i = 0; i < numbersCount - 1; i++) {
            currentNumber1 = Integer.parseInt(scanner.nextLine());
            currentNumber2 = Integer.parseInt(scanner.nextLine());
            int currentSum = currentNumber1 + currentNumber2;

            if (checkDiff < Math.abs(firstSum - currentSum)) {
                checkDiff = Math.abs(firstSum - currentSum);
            }

            firstSum = currentSum;
        }

        if (checkDiff == 0) {
            System.out.printf("Yes, value=%d", firstSum);
        } else {
            System.out.printf("No, maxdiff=%d", checkDiff);
        }
    }
}
