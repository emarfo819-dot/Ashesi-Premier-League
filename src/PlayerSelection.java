import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Please enter your height(in meters): ");
        double height = input.nextDouble();
        System.out.print("Please enter your weight(in pounds): ");
        double weight = input.nextDouble();
        System.out.print("Please enter your jersey number: ");
        int jerseyNumber = input.nextInt();
        final double pound = 0.45359237;
        final int meter = 100;
        double convertedHeight = height * meter;
        double convertedWeight = weight * pound;
        int roundedWeight = (int) convertedWeight;
        boolean eligible = (age >= 18 && age < 35) && (roundedWeight < 90);
        boolean primePlayer = age >= 20 && age <= 30;
        boolean play_Rest = primePlayer && roundedWeight < 80;


        System.out.println("\n-----------PLAYER REPORT------------");
        System.out.println("Player: " + name);
        if (age < 20) {
            System.out.println("Age: " + age + "(Rising Star)");
        } else if (age >= 20 || age <= 30) {
            System.out.println("Age: " + age + "(Prime Player)");
        } else if (age > 30) {
            System.out.println("Age: " + age + "(Veteran)");
        }


        System.out.println("Height: " + convertedHeight + "cm");
        System.out.println("Weight: " + roundedWeight + "kg");
        System.out.println("Jersey: " + jerseyNumber);
        switch (jerseyNumber) {
            case 1:
                System.out.println("Position: Goalkeeper");
                break;
            case 2:
            case 5:
                System.out.println("Position: Defender");
                break;
            case 6:
            case 8:
                System.out.println("Position: Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Position: Winger");
                break;
            case 9:
                System.out.println("Position: Striker");
                break;
            case 10:
                System.out.println("Position: Playmaker");
                break;
            default:
                System.out.println("Player position not known");
        }

        if (jerseyNumber == 7 || jerseyNumber == 11 || jerseyNumber == 9) {
            System.out.println("Attacker jersey: Yes");
        } else {
            System.out.println("Attacker jersey: No");
        }

        if (eligible) {
            System.out.println("Eligibility: Eligible");
        } else {
            System.out.println("Eligibility: Not eligible");
        }

        if (play_Rest) {
            System.out.println("Decision: Player is in the starting lineup");
        } else {
            System.out.println("Decision: Player is on the bench because he is too heavy or not in his prime");
        }


        String finalDecision = play_Rest ? "Play" : "Rest";

        System.out.println("Final Decision: " + finalDecision);


    }
}
