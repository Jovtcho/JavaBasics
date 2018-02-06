import java.util.Scanner;

public class P08OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < numberCount; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if ((i % 2) == 0) {
                evenSum += currentNumber;
            } else {
                oddSum += currentNumber;
            }
        }

        if (oddSum == evenSum) {
            System.out.printf("Yes%nSum = %d%n", oddSum);
        } else {
            System.out.printf("No%nDiff = %d%n", Math.abs(oddSum-evenSum));
        }
    }

}
