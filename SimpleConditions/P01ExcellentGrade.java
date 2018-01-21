import java.util.Scanner;

public class P01ExcellentGrade {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double result = Double.parseDouble(console.nextLine());

        if (result >= 5.5) {
            System.out.println("Excellent!");
        }
    }
}
