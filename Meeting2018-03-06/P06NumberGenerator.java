import java.util.Scanner;

public class P06NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int specNum = Integer.parseInt(scanner.nextLine());
        int checkNum = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = l; k >= 1; k--) {
                    int num = i * 100 + j * 10 + k;
                    if (num % 3 == 0) {
                        specNum += 5;
                    } else if (num % 10 == 5) {
                        specNum -= 2;
                    } else if (num % 2 == 0) {
                        specNum *= 2;
                    }

                    if (specNum >= checkNum) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specNum);
                        return;
                    }
                }
            }
        }

        System.out.printf("No! %d is the last reached special number.", specNum);
    }
}
