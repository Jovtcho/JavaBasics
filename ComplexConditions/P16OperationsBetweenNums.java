import java.util.Scanner;

public class P16OperationsBetweenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int result = 0;
        String textOutput = "";

        switch (operator) {
            case "+":
                result = num1 + num2;
                textOutput = (result % 2 == 0) ? "even" : "odd";
//                if (result % 2 == 0) {
//                    textOutput = "even";
//                } else {
//                    textOutput = "odd";
//                }
                System.out.printf("%d + %d = %d - %s", num1, num2, result, textOutput);
                break;
            case "-":
                result = num1 - num2;
                textOutput = (result % 2 == 0) ? "even" : "odd";
                System.out.printf("%d - %d = %d - %s", num1, num2, result, textOutput);
                break;
            case "*":
                result = num1 * num2;
                textOutput = (result % 2 == 0) ? "even" : "odd";
                System.out.printf("%d * %d = %d - %s", num1, num2, result, textOutput);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    double resultDivide = 1.0 * num1 / num2;
                    System.out.printf("%d / %d = %.2f", num1, num2, resultDivide);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = num1 % num2;
                    System.out.printf("%d %% %d = %d", num1, num2, result);
                }
                break;
        }
    }
}
