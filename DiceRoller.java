package Practice;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {

        // JAVA DICE ROLLER PROGRAM

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // DECLARE VARIABLES

        int numOfDice;
        int total = 0;

        // GET NUMBER OF DICE FROM USER

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        // CHECk IF NUMBER OF DICE > 0
        // ROLL ALL THE DICE
        // GET THE TOTAL

        if(numOfDice > 0) {
            for(int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("Number of dice must be greater than 0");
        }

        // DISPLAY ASCII OF DICE



        scanner.close();
    }

    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """; // me """ otidhpote grapsoume ekei mesa tha emfanizetai etsi opws einai

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}
