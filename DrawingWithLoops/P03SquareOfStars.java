import java.util.Scanner;

public class P03SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            System.out.println(stars("*", number));
        }
    }

    public static String stars(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }
}
