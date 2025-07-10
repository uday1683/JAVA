package snakeWaterGun;

import java.util.Scanner;
import java.util.Random;

public class Mini_Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the number of matches you want to play:");
        int match = sc.nextInt();

        int won = 0, loose = 0, draw = 0;

        for (int i = 0; i < match; i++) {
            System.out.println("Please enter 's' for Snake, 'w' for Water, or 'g' for Gun:");
            char v = sc.next().charAt(0);
            System.out.println("You chose: " + v);

            if (v == 's' || v == 'w' || v == 'g') {
                int com = rand.nextInt(100); // 🔄 Move this inside loop

                char computerChoice;
                if (com < 33) {
                    computerChoice = 's';
                } else if (com < 66) {
                    computerChoice = 'g';
                } else {
                    computerChoice = 'w';
                }

                System.out.println("Computer chose: " + computerChoice);

                // Game logic
                if (v == computerChoice) {
                    System.out.println("Match Drawn");
                    draw++;
                } else if ((v == 's' && computerChoice == 'w') ||
                           (v == 'w' && computerChoice == 'g') ||
                           (v == 'g' && computerChoice == 's')) {
                    System.out.println("You won the match :)");
                    won++;
                } else {
                    System.out.println("You lost the match :(");
                    loose++;
                }
            } else {
                System.out.println("Invalid input. Please enter only 's', 'w', or 'g'.");
            }

            System.out.println("--------------------------------------");
        }

        // Final statistics
        System.out.println("********************************");
        System.out.println("STATISTICS:");
        System.out.println("You Won   : " + won);
        System.out.println("You Lost  : " + loose);
        System.out.println("Drawn     : " + draw);
        System.out.println("********************************");

        sc.close();
    }
}
