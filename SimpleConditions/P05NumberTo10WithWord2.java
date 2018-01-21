import java.util.Scanner;

public class P05NumberTo10WithWord2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        String numberString = "";

        switch (number) {
            case 0:
                numberString = "zero";
                break;
            case 1:
                numberString = "one";
                break;
            case 2:
                numberString = "two";
                break;
            case 3:
                numberString = "three";
                break;
            case 4:
                numberString = "four";
                break;
            case 5:
                numberString = "five";
                break;
            case 6:
                numberString = "six";
                break;
            case 7:
                numberString = "seven";
                break;
            case 8:
                numberString = "eight";
                break;
            case 9:
                numberString = "nine";
                break;
            default:
                numberString = "number too big";
        }

        System.out.println(numberString);
    }
}
