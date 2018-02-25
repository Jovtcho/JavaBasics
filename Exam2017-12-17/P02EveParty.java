import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02EveParty {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int guestsCount = Integer.parseInt(br.readLine());
        int budget = Integer.parseInt(br.readLine());
        int coverPerGuest = 20;

        int allGuestsCover = coverPerGuest * guestsCount;
        int diff = budget - allGuestsCover;

        if (diff >= 0) {
            double fireworksMoney = diff * 40.0 / 100.0;
            double donationMoney = diff - fireworksMoney;
            System.out.printf("Yes! %d lv are for fireworks and %d lv are for donation.",
                    Math.round(fireworksMoney), Math.round(donationMoney));
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.",
                    Math.abs(diff));
        }
    }
}