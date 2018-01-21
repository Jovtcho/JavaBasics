import java.util.Scanner;

public class P14TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hour = Integer.parseInt(console.nextLine());
        int minute = Integer.parseInt(console.nextLine());
        minute = minute + 15;

        if (minute >= 60) {
            hour = hour + 1;
            minute = minute - 60;
        }

        if (hour >= 24) {
            hour = hour - 24;
        }

/*        if ((minute / 10) < 1) {
            System.out.println(hour + ":0" + minute);
        } else {
            System.out.println(hour + ":" + minute);
        } */

        System.out.printf("%d:%02d", hour, minute);
    }
}
