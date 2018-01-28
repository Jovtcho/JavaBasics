import java.util.Scanner;


public class P01SexAndAge {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String sex = console.nextLine();

        if ("m".equalsIgnoreCase(sex)) {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        } else {
            if (age < 16) {
                System.out.printf("Miss");
            } else {
                System.out.printf("Ms.");
            }
        }
    }
}
