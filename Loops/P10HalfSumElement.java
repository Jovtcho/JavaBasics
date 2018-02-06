import java.util.Scanner;

public class P10HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int numberSum = 0;

        for (int i = 0; i < countNumber; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            numberSum += currentNumber;
        }

        boolean checkSum = (maxNumber - (numberSum - maxNumber)) == 0;
        if (checkSum) {
            System.out.printf("Yes%nSum = %d", maxNumber);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNumber - (numberSum - maxNumber)));
        }
    }
}