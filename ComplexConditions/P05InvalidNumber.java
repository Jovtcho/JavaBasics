import java.util.Scanner;

public class P05InvalidNumber {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        boolean check = ((number != 0) && ((number < 100) || (number > 200)));
        if (check) {
            System.out.println("invalid");
        }
    }
}
