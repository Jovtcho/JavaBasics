import java.util.Scanner;

public class P11EqualWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word1 = console.nextLine().toLowerCase();
        String word2 = console.nextLine().toLowerCase();

        boolean check = word1.equals(word2);

        if (check) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}