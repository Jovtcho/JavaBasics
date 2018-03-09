import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int studentsCount = Integer.parseInt(br.readLine());
        int topStudent = 0;
        int between4And5Student = 0;
        int between3And4Student = 0;
        int failStudent = 0;
        int counterWhile = studentsCount;
        double grades = 0.0;

        while (counterWhile-- > 0) {
            double grade = Double.parseDouble(br.readLine());
            grades += grade;
            if (grade < 3) {
                failStudent++;
            } else if (grade < 4) {
                between3And4Student++;
            } else if (grade < 5) {
                between4And5Student++;
            } else {
                topStudent++;
            }
        }

        System.out.printf("Top students: %.2f%%\n", topStudent * 100.0 / studentsCount);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", between4And5Student * 100.0 / studentsCount);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", between3And4Student * 100.0 / studentsCount);
        System.out.printf("Fail: %.2f%%\n", failStudent * 100.0 / studentsCount);
        System.out.printf("Average: %.2f\n", grades / studentsCount);
    }
}
