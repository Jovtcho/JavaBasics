import java.util.Scanner;

public class P16NumberBelow100ToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 0 || number > 100) {
            System.out.println("invalid number");
        } else if (number == 100) {
            System.out.println("one hundred");
        } else if (number == 0) {
            System.out.println("zero");
        } else if (10 <= number && number <= 19) {
            if (number == 10) {
                System.out.println("ten");
            } else if (number == 11) {
                System.out.println("eleven");
            } else if (number == 12) {
                System.out.println("twelve");
            } else if (number == 13) {
                System.out.println("thirteen");
            } else if (number == 14) {
                System.out.println("fourteen");
            } else if (number == 15) {
                System.out.println("fifteen");
            } else if (number == 16) {
                System.out.println("sixteen");
            } else if (number == 17) {
                System.out.println("seventeen");
            } else if (number == 18) {
                System.out.println("eighteen");
            } else {
                System.out.println("nineteen");
            }
        } else {
            String onesStr = "";
            String tensStr = "";

            switch (number % 10) {
                case 1:
                    onesStr = "one";
                    break;
                case 2:
                    onesStr = "two";
                    break;
                case 3:
                    onesStr = "three";
                    break;
                case 4:
                    onesStr = "four";
                    break;
                case 5:
                    onesStr = "five";
                    break;
                case 6:
                    onesStr = "six";
                    break;
                case 7:
                    onesStr = "seven";
                    break;
                case 8:
                    onesStr = "eight";
                    break;
                case 9:
                    onesStr = "nine";
                    break;
            }

            switch (number / 10) {
                case 2:
                    tensStr = "twenty";
                    break;
                case 3:
                    tensStr = "thirty";
                    break;
                case 4:
                    tensStr = "forty";
                    break;
                case 5:
                    tensStr = "fifty";
                    break;
                case 6:
                    tensStr = "sixty";
                    break;
                case 7:
                    tensStr = "seventy";
                    break;
                case 8:
                    tensStr = "eighty";
                    break;
                case 9:
                    tensStr = "ninety";
                    break;
            }

            if (onesStr.isEmpty()) {
                System.out.println(tensStr);
            } else {
                System.out.printf(tensStr.isEmpty() ? onesStr + "\n" : "%s %s%n", tensStr, onesStr);
            }
        }
    }
}
