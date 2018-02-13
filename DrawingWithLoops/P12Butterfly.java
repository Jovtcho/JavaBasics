import java.util.Scanner;

public class P12Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int butterflySize = Integer.parseInt(scanner.nextLine());

//Upper part
        for (int i = 1; i <= butterflySize - 2; i++) {
            if (i % 2 != 0) {
                System.out.println(draw("*", butterflySize - 2) + "\\ /" + draw("*", butterflySize - 2));
            } else {
                System.out.println(draw("-", butterflySize - 2) + "\\ /" + draw("-", butterflySize - 2));
            }
        }

//Middle part
        System.out.println(draw(" ", butterflySize - 1) + "@");

//Lower part
        for (int i = 1; i <= butterflySize - 2; i++) {
            if (i % 2 != 0) {
                System.out.println(draw("*", butterflySize - 2) + "/ \\" + draw("*", butterflySize - 2));
            } else {
                System.out.println(draw("-", butterflySize - 2) + "/ \\" + draw("-", butterflySize - 2));
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