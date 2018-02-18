import java.util.Scanner;

public class P14NumberTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print((number - j) + " ");
            }
            System.out.println();
        }
    }
}
