import java.util.Scanner;

public class TableNums2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int step = 1;
        int currentN = 0;

        for (int row = 1; row <= n; row++) {
            currentN = row;
            step = 1;
            for (int col = 0; col < n; col++) {
                System.out.print(currentN + " ");
                if (currentN >= n) {
                    step = -1;
                }
                currentN = currentN + step;
            }
            System.out.println();
        }
    }
}