import java.util.Scanner;

public class P09SumDigitis {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int sum = 0;

        do {
            int tempNumber = number % 10;
            sum += tempNumber;
            number = number / 10;
        } while (number != 0);

        System.out.println(sum);
    }
}
