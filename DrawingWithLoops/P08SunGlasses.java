import java.util.Scanner;

public class P08SunGlasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sunGlassesSize = Integer.parseInt(scanner.nextLine());
        int middleSize = ((sunGlassesSize - 2) + 1) / 2;

        System.out.println(draw("*", 2 * sunGlassesSize) + draw(" ", sunGlassesSize)
                + draw("*", 2 * sunGlassesSize));

        for (int i = 1; i <= sunGlassesSize - 2; i++) {
            System.out.print(draw("*", 1) + draw("/", 2 * sunGlassesSize - 2)
                    + draw("*", 1));
            if (i == middleSize) {
                System.out.println(draw("|", sunGlassesSize) + draw("*", 1)
                        + draw("/", 2 * sunGlassesSize - 2) + draw("*", 1));
            } else {
                System.out.println(draw(" ", sunGlassesSize) + draw("*", 1)
                        + draw("/", 2 * sunGlassesSize - 2) + draw("*", 1));
            }
        }

        System.out.println(draw("*", 2 * sunGlassesSize) + draw(" ", sunGlassesSize)
                + draw("*", 2 * sunGlassesSize));
    }

    public static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
