import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17SpecialNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        //StringBuilder result = new StringBuilder();

        for (int d1 = 1; d1 <= 9; d1++) {
            if ((number % d1) != 0) {
                continue;
            }
            for (int d2 = 1; d2 <= 9; d2++) {
                if ((number % d2) != 0) {
                    continue;
                }
                for (int d3 = 1; d3 <= 9; d3++) {
                    if ((number % d3 != 0)) {
                        continue;
                    }
                    for (int d4 = 1; d4 <= 9; d4++) {
                        if ((number % d4) != 0) {
                            continue;
                        }
//                        result.append(String.format("%d%d%d%d ", d1, d2, d3, d4));
//                        System.out.print("" + d1 + d2 + d3 + d4 + " ");
//                        String output = "".concat(String.valueOf(d1))
//                                .concat(String.valueOf(d2))
//                                .concat(String.valueOf(d3))
//                                .concat(String.valueOf(d4))
//                                .concat(" ");
//                        System.out.print(output);
                        System.out.printf("%d%d%d%d ", d1, d2, d3, d4);
                    }
                }
            }
        }

        //System.out.println(result.toString().trim());
    }
}

