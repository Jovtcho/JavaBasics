import java.util.Scanner;

public class P18Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double averageGrades = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double scholarshipSocialGrades = 4.50;
        double socialScholarshipPercent = 35.0;
        double scholarshipExcellentGrades = 5.50;
        double scholarshipExcellentGradesFactor = 25.0;
        double scholarship = 0.0;

        if (income >= minSalary) {
            if (averageGrades < scholarshipExcellentGrades) {
                System.out.println("You cannot get a scholarship!");
            } else {
                scholarship = averageGrades * scholarshipExcellentGradesFactor;
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarship));
            }
        } else {
            if (averageGrades <= scholarshipSocialGrades) {
                System.out.println("You cannot get a scholarship!");
            } else if (averageGrades < scholarshipExcellentGrades) {
                scholarship = minSalary * socialScholarshipPercent / 100;
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarship));
            } else {
                double socialScholarship = minSalary * socialScholarshipPercent / 100;
                double excellentScholarship = averageGrades * scholarshipExcellentGradesFactor;

                if (excellentScholarship >= socialScholarship) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarship));
                } else {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
                }
            }
        }
    }
}
