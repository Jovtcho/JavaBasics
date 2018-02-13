public class P01Rectangle10Stars {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(stars("*", 10));
        }

    }

    public static String stars(String str, int count) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            output.append(str);
        }

        return output.toString();
    }
}
