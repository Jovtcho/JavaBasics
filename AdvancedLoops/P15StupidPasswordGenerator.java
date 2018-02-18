import java.util.Scanner;

public class P15StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int countNumber = Integer.parseInt(console.nextLine());
        int countChar = Integer.parseInt(console.nextLine());

        for (int i = 1; i < countNumber; i++) {
            for (int j = 1; j < countNumber; j++) {
                for (char ch1 = 'a'; ch1 < 97 + countChar; ch1++) {
                    for (char ch2 = 'a'; ch2 < 97 + countChar; ch2++) {
                        for (int k = Math.max(i, j) + 1; k <= countNumber; k++) {
                            System.out.printf("%d%d%c%c%d ", i, j, ch1, ch2, k);
                        }
                    }
                }
            }
        }
    }
}
