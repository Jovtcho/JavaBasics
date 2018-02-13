import java.util.Scanner;

public class P05SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("+ " + draw("- ", number - 2) + "+");

        for (int i = 0; i < number - 2; i++) {
            System.out.print("| " + draw("- ", number - 2) + "|");
            System.out.println();
        }

        System.out.println("+ " + draw("- ", number - 2) + "+");
    }

    public static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
