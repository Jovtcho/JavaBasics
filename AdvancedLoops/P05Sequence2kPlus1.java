import java.util.Scanner;

public class P05Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int result = 1;

        while (result <= number) {
            System.out.println(result);
            result = 2 * result + 1;
        }
    }
}