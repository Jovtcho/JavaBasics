import java.util.Scanner;

public class P13Stop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        long start = System.currentTimeMillis();
// First row
        for (int i = 1; i <= number + 1; i++) {
            System.out.print(".");
        }
        for (int i = 1; i <= 2 * number + 1; i++) {
            System.out.print("_");
        }
        for (int i = 1; i <= number + 1; i++) {
            System.out.print(".");
        }
        System.out.println("");

// Upper half
        for (int j = 1; j <= number; j++) {
            for (int i = 1; i <= number + 1 - j; i++) {
                System.out.print(".");
            }
            System.out.print("//");
            for (int i = 1; i <= 2 * (number + j) - 3; i++) {
                System.out.print("_");
            }
            System.out.print("\\\\");
            for (int i = 1; i <= number + 1 - j; i++) {
                System.out.print(".");
            }
            System.out.println("");
        }

// STOP row
        System.out.print("//");
        for (int i = 1; i <= 2 * number - 3; i++) {
            System.out.print("_");
        }
        System.out.print("STOP!");
        for (int i = 1; i <= 2 * number - 3; i++) {
            System.out.print("_");
        }
        System.out.println("\\\\");

// Lower half
        for (int j = 1; j <= number; j++) {
            for (int i = 1; i <= j - 1; i++) {
                System.out.print(".");
            }
            System.out.print("\\\\");
            for (int i = 1; i <= 4 * number + 1 - 2 * j; i++) {
                System.out.print("_");
            }
            System.out.print("//");
            for (int i = 1; i <= j - 1; i++) {
                System.out.print(".");
            }
            System.out.println("");
        }
        long end = System.currentTimeMillis();
        System.out.println("Concatenation = " + ((end - start)) + " millisecond");
    }
}
