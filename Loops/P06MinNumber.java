import java.util.Scanner;

public class P06MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int countNumbers = Integer.parseInt(console.nextLine());

        int MinNumber = Integer.MAX_VALUE;

        for (int i = 0; i < countNumbers; i++) {
            int number = Integer.parseInt(console.nextLine());
            if (number < MinNumber) {
                MinNumber = number;
            }
        }
        System.out.println(MinNumber);
    }
}
