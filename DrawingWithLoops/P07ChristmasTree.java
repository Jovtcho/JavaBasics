import java.util.Scanner;

public class P07ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int treeSize = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= treeSize; i++) {
            System.out.print(draw(" ", treeSize - i));
            System.out.print(draw("*", i));
            System.out.print(" | ");
            System.out.print(draw("*", i));
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
