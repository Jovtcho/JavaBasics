import java.util.Scanner;

public class P03EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        boolean check = (number % 2 == 0);

        if (check) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
