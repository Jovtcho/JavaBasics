import java.util.Scanner;

public class P05ChristmasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String output = repeatStr(".", 2 * num - 1)
                + "/|\\" + repeatStr(".", 2 * num - 1) + "\n";

        output += repeatStr(".", 2 * num - 1)
                + "\\|/" + repeatStr(".", 2 * num - 1) + "\n";

        for (int i = 0; i < 2 * num; i++) {
            String str = repeatStr(".", 2 * num - 1 - i)
                    + "*" + repeatStr("-", i)
                    + "*" + repeatStr("-", i)
                    + "*" + repeatStr(".", 2 * num - 1 - i) + "\n";
            output += str;
        }

        output += repeatStr("*", 4 * num + 1) + "\n";
        output += "*" + repeatStr(".*", 2 * num) + "\n";
        output += repeatStr("*", 4 * num + 1) + "\n";

        System.out.println(output);

    }

    private static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }

        return text;
    }
}
