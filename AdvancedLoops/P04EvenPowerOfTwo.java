import java.util.Scanner;

public class P04EvenPowerOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int result = 1;

        for (int i = 1; i <= number / 2 + 1; i++) {
            System.out.println(result);
            result *= 4;
        }
    }
}