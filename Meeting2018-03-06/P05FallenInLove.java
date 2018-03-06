import java.util.Scanner;

public class P05FallenInLove {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        for (int i = 0; i < number; i++) {
            System.out.println("#" + draw("~", i) + "#" + draw(".", 2 * (number - i)) + "#" + draw(".", 2 * i)
                    + "#" + draw(".", 2 * (number - i)) + "#" + draw("~", i) + "#");
        }

        for (int i = 0; i <= number; i++) {
            System.out.println(draw(".", 2 * i + 1) + "#" + draw("~", number - i) + "#"
                    + draw(".", 2 * (number - i)) + "#" + draw("~", number - i) + "#" + draw(".", 2 * i + 1));
        }

        for (int i = 0; i < number; i++) {
            System.out.println(draw(".", 2 * (number + 1)) + "##" + draw(".", 2 * (number + 1)));
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
