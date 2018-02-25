import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P05ChristmasSock {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        //first row
        System.out.println("|" + draw("-", 2 * n) + "|");

        //second row
        System.out.println("|" + draw("*", 2 * n) + "|");

        //middle part
        for (int i = 0; i < n; i++) {
            System.out.println("|" + draw("-", n - i)
                    + draw("~", 2 * i)
                    + draw("-", n - i) + "|");
        }

        for (int i = n - 2; i > 0; i--) {
            System.out.println("|" + draw("-", n - i)
                    + draw("~", 2 * i)
                    + draw("-", n - i) + "|");
        }

        // low part
        int middle = 0;
        if (n % 2 != 0) {
            middle = (n + 2) / 2;
        } else {
            middle = (n + 1) / 2 + 1;
        }

        for (int i = 0; i < n + 2; i++) {
            if (i == middle - 1) {
                String merry = draw("-", i) + "\\"
                        + draw(".", n - 2) + "MERRY"
                        + draw(".", n - 2) + "\\";
                System.out.println(merry);
                continue;
            }

            if (i == middle + 1) {
                String merry = draw("-", i) + "\\"
                        + draw(".", n - 2) + "X-MAS"
                        + draw(".", n - 2) + "\\";
                System.out.println(merry);
                continue;
            }

            String lowerPart = draw("-", i) + "\\"
                    + draw(".", 2 * n + 1) + "\\";
            System.out.println(lowerPart);
        }

        //last row
        System.out.println(draw("-", n + 2) + "\\" + draw("_", 2 * n + 1) + ")");
    }

    private static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
