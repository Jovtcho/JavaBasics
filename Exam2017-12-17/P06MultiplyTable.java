import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P06MultiplyTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int firstDigit = num % 10;
        num = num / 10;
        int secondDigit = num % 10;
        int thirdDigit = num / 10;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= firstDigit; i++) {
            for (int j = 1; j <= secondDigit; j++) {
                for (int k = 1; k <= thirdDigit; k++) {
//                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
//                    sb.append(String.format("%d * %d * %d = %d;%n", i, j, k, i * j * k));
                    int product = i * j * k;
                    String str = "" + i + " * " + j + " * " + k + " = " + product + ";" + "\n";
                    sb.append(str);

                }
            }
        }

        System.out.println(sb.toString());
    }
}
