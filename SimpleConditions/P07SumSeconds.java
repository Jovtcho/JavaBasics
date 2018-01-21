import java.util.Scanner;

public class P07SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int time1 = Integer.parseInt(console.nextLine());
        int time2 = Integer.parseInt(console.nextLine());
        int time3 = Integer.parseInt(console.nextLine());

        int time = time1 + time2 + time3;
        int min = 0;
        int sec = 0;

        if (time / 60 >= 1) {
            min = time / 60;
            //sec = time - min * 60;
            sec = time % 60;
        } else {
            min = 0;
            sec = time;
        }

        if (sec < 10) {
            System.out.println(min + ":0" + sec);
        } else {
            System.out.println(min + ":" + sec);
        }
    }
}
