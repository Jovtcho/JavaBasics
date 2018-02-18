import java.util.Scanner;

public class P03PowersOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
//        int result = 1;

        for (int i = 0; i <= number; i++) {
            System.out.println((int) Math.pow(2, i));
//            System.out.println(result);
//            result *= 2;
        }
    }
}
