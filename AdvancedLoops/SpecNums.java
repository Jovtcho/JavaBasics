import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SpecNums {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int num = Integer.parseInt(scanner.nextLine());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        //long start = System.currentTimeMillis();

        for (int d1 = 1; d1 <= 9; d1++) {
            if (num % d1 == 0) {
                for (int d2 = 1; d2 <= 9; d2++) {
                    if (num % d2 == 0) {
                        for (int d3 = 1; d3 <= 9; d3++) {
                            if (num % d3 == 0) {
                                for (int d4 = 1; d4 <= 9; d4++) {
                                    if (num % d4 == 0) {
                                        System.out.print("" + d1 + d2 + d3 + d4 + " ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

//        long end = System.currentTimeMillis();
//        System.out.println();
//        System.out.println("Concatenation = " + ((end - start)) + " millisecond");
    }
}
