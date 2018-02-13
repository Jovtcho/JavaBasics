import java.util.Scanner;

public class P10Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diamondSize = Integer.parseInt(scanner.nextLine());

        if (diamondSize % 2 != 0) {
            for (int i = 0; i <= diamondSize / 2; i++) {
                if (i != 0) {
                    System.out.println(draw("-", diamondSize / 2 - i) + draw("*", 1)
                            + draw("-", 2 * i - 1) + draw("*", 1) + draw("-", diamondSize / 2 - i));
                } else {
                    System.out.println(draw("-", diamondSize / 2 - i) + draw("*", 1)
                            + draw("-", 2 * i - 1) + draw("-", diamondSize / 2 - i));
                }
            }
            for (int i = (diamondSize - 1) / 2; i > 0 / 2; i--) {
                if (i != 1) {
                    System.out.println(draw("-", diamondSize / 2 - i + 1) + draw("*", 1)
                            + draw("-", 2 * i - 3) + draw("*", 1) + draw("-", diamondSize / 2 - i + 1));
                } else {
                    System.out.println(draw("-", diamondSize / 2 - i + 1) + draw("*", 1)
                            + draw("-", 2 * i - 3) + draw("-", diamondSize / 2 - i + 1));
                }
            }
        } else {
            for (int i = 0; i <= diamondSize / 2 - 1; i++) {
                System.out.println(draw("-", diamondSize / 2 - 1 - i) + draw("*", 1)
                        + draw("-", 2 * i) + draw("*", 1) + draw("-", diamondSize / 2 - 1 - i));
            }
            for (int i = (diamondSize - 1) / 2; i > 0; i--) {
                System.out.println(draw("-", diamondSize / 2 - i) + draw("*", 1)
                        + draw("-", 2 * (i - 1)) + draw("*", 1) + draw("-", diamondSize / 2 - i));
            }
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