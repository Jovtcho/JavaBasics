import java.util.Scanner;

public class P05Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n - 2; i++) {
            System.out.println(draw("*\\", i + 1) + draw(" ", 4 * (n - 2 - i)) + draw("/*", i + 1));
        }

        System.out.println(draw("\\/", 2 * (n - 1)));

        for (int i = 0; i < n / 2; i++) {
            System.out.println(draw("<", 2 * n - 5) + "*|**|*" + draw(">", 2 * n - 5));
        }

        System.out.println(draw("/\\", 2 * (n - 1)));

        for (int i = n - 3; i >= 0; i--) {
            System.out.println(draw("*/", i + 1) + draw(" ", 4 * (n - 2 - i)) + draw("\\*", i + 1));
        }
    }

    private static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
