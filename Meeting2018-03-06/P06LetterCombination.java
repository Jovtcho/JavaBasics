import java.util.Scanner;

public class P06LetterCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startLetter = scanner.nextLine().charAt(0);
        char endLetter = scanner.nextLine().charAt(0);
        char escapeLetter = scanner.nextLine().charAt(0);
        int counter = 0;

        for (char i = startLetter; i <= endLetter; i++) {
            if (i != escapeLetter) {
                for (char j = startLetter; j <= endLetter; j++) {
                    if (j != escapeLetter) {
                        for (char k = startLetter; k <= endLetter; k++) {
                            if (k != escapeLetter) {
                                String str = "" + i + j + k;
                                System.out.print(str + " ");
                                counter++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(counter);
    }
}
