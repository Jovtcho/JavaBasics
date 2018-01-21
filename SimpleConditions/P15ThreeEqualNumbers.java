import java.util.Scanner;

public class P15ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number1 = Integer.parseInt(console.nextLine());
        int number2 = Integer.parseInt(console.nextLine());
        int number3 = Integer.parseInt(console.nextLine());
        boolean check1 = number1 == number2;
        boolean check2 = number2 == number3;

        if (check1 && check2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
