import java.util.Scanner;

public class P09House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houseSize = Integer.parseInt(scanner.nextLine());
        int roofHeight = (houseSize + 1) / 2;
        int houseHeight = houseSize / 2;

        for (int i = 1; i <= roofHeight; i++) {
            if ((houseSize % 2) != 0) {
                System.out.println(draw("-", roofHeight - i) + draw("*", 2 * i - 1)
                        + draw("-", roofHeight - i));
            } else {
                System.out.println(draw("-", roofHeight - i) + draw("*", 2 * i)
                        + draw("-", roofHeight - i));
            }
        }

        for (int i = 1; i <= houseHeight; i++) {
            System.out.println(draw("|", 1) + draw("*", houseSize - 2) + draw("|", 1));
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
