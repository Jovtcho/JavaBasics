import java.util.Scanner;

public class P13NumberPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int outputNumber = 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (outputNumber <= number) {
                    System.out.print(outputNumber + " ");
                    outputNumber++;
                }
            }
            System.out.println();
        }
    }
}