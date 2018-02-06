import java.util.Scanner;

public class P07LeftRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < number; i++) {
            int leftNumber = Integer.parseInt(console.nextLine());
            sumLeft += leftNumber;
        }

        for (int i = 0; i < number; i++) {
            int rightNumber = Integer.parseInt(console.nextLine());
            sumRight += rightNumber;
        }

        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft-sumRight));
        }
    }
}
