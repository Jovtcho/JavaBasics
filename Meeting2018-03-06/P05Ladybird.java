import java.util.Scanner;

public class P05Ladybird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(draw(" ", number - 2) + "@" + "   " + "@");
        System.out.println(draw(" ", number - 1) + "\\_/");
        System.out.println(draw(" ", number - 1) + "/ \\");
        System.out.println(draw(" ", number - 1) + "|_|");

        for (int i = 0; i < number; i++) {
            System.out.println(draw(" ", number - 1 - i) + "/" + draw(" ", i) + "|"
                    + draw(" ", i) + "\\");
        }

        if (number % 2 == 0) {
            for (int i = 0; i < number / 2; i++) {
                System.out.println("|" + draw(" ", number / 2 - 1) + "@" + draw(" ", number / 2 - 1) + "|"
                        + draw(" ", number / 2 - 1) + "@" + draw(" ", number / 2 - 1) + "|");
            }
        } else {
            for (int i = 0; i < number / 2; i++) {
                System.out.println("|" + draw(" ", number / 2 - 1) + "@" + draw(" ", number / 2) + "|"
                        + draw(" ", number / 2) + "@" + draw(" ", number / 2 - 1) + "|");
            }
        }

        for (int i = 0; i < number / 2; i++) {
            System.out.println(draw(" ", i) + "\\" + draw(" ", number - 1 - i) + "|"
                    + draw(" ", number - 1 - i) + "/");
        }

        if (number % 2 == 0) {
            System.out.println(draw(" ", number / 2) + draw("^", number / 2) + "|"
                    + draw("^", number / 2));
        } else {
            System.out.println(draw(" ", number / 2 + 1) + draw("^", number / 2) + "|"
                    + draw("^", number / 2));
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

