import java.util.Scanner;

public class P12Fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int numberFibonacci0 = 1;
        int numberFibonacci1 = 1;
        int tempNumber = 0;

        if (number < 2) {
            System.out.println(numberFibonacci0);
        } else {
            for (int i = 1; i < number; i++) {
                tempNumber = numberFibonacci0 + numberFibonacci1;
                numberFibonacci0 = numberFibonacci1;
                numberFibonacci1 = tempNumber;
            }
            System.out.println(tempNumber);
        }
    }
}