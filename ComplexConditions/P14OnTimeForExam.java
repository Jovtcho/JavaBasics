import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class P14OnTimeForExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int examHour = Integer.parseInt(console.nextLine());
        int examMinute = Integer.parseInt(console.nextLine());
        int arrivalHour = Integer.parseInt(console.nextLine());
        int arrivalMinute = Integer.parseInt(console.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;
        int difference = 0;

        if (arrivalTime > examTime) {
            System.out.println("Late");
            difference = arrivalTime - examTime;
            int hour = difference / 60;
            int minute = difference % 60;
            if (hour < 1) {
                System.out.println(minute + " minutes after the start");
            } else {
                if (minute < 10) {
                    System.out.println(hour + ":0" + minute + " hours after the start");
                } else {
                    System.out.println(hour + ":" + minute + " hours after the start");
                }
            }
        } else if ((arrivalTime + 30) < examTime) {
            System.out.println("Early");
            difference = examTime - arrivalTime;
            int hour = difference / 60;
            int minute = difference % 60;
            if (hour < 1) {
                System.out.println(minute + " minutes before the start");
            } else {
                if (minute < 10) {
                    System.out.println(hour + ":0" + minute + " hours before the start");
                } else {
                    System.out.println(hour + ":" + minute + " hours before the start");
                }
            }
        } else {
            System.out.println("On time");
            difference = examTime - arrivalTime;
            System.out.println(difference + " minutes before the start");
        }
    }
}

