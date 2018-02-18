import java.util.Scanner;

public class P16MagicNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int digit;

        //long start = System.currentTimeMillis();

        for (int digit6 = 1; digit6 <= 9; digit6++) {
            for (int digit5 = 1; digit5 <= 9; digit5++) {
                for (int digit4 = 1; digit4 <= 9; digit4++) {
                    for (int digit3 = 1; digit3 <= 9; digit3++) {
                        for (int digit2 = 1; digit2 <= 9; digit2++) {
                            for (int digit1 = 1; digit1 <= 9; digit1++) {
                                digit = digit1 * digit2 * digit3 * digit4 * digit5 * digit6;
                                if (number == digit) {
                                    System.out.printf("%d%d%d%d%d%d ", digit6, digit5, digit4, digit3, digit2, digit1);
                                }
                            }
                        }
                    }
                }
            }
        }

//        System.out.println();
//        long end = System.currentTimeMillis();
//        System.out.println("Time duration = " + ((end - start)) + " millisecond") ;
    }
}
