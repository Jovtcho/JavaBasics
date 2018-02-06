import java.util.Scanner;

public class P04Sum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum = Integer.parseInt(console.nextLine()) + sum;
        }

        System.out.println(sum);
    }
}
