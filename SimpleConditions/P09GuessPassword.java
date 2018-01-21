import java.util.Scanner;

public class P09GuessPassword {
    public static void main(String[] args) {
        String presetPassword = "s3cr3t!P@ssw0rd";
        Scanner console = new Scanner(System.in);
        String password = console.nextLine();

        boolean check = password.equals(presetPassword);

//        if (check) {
//            System.out.println("Welcome");
//        } else {
//            System.out.println("Wrong password!");
//        }

        System.out.println(check ? "Welcome" : "Wrong password!");
    }
}
