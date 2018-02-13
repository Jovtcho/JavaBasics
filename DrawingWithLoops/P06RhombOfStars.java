import java.util.Scanner;

public class P06RhombOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rhombSize = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rhombSize; i++) {
            System.out.print(draw(" ", rhombSize - i));
            System.out.print(draw("*", 1));
            System.out.print(draw(" *", i - 1));
            System.out.println();
        }

        for (int i = 1; i < rhombSize; i++) {
            System.out.print(draw(" ", i));
            System.out.print(draw("*", 1));
            System.out.print(draw(" *", rhombSize - 1 - i));
            System.out.println();
        }
    }

    public static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
