import java.util.Scanner;

public class P10AnimalType {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String animal = console.nextLine().toLowerCase();
        String animalKind = "";

        switch (animal) {
            case "dog":
                animalKind = "mammal";
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                animalKind = "reptile";
                break;
            default:
                animalKind = "unknown";
                break;
        }

        System.out.println(animalKind);
    }
}
