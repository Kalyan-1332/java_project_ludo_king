//Code For Ludo Game In Java Using Array

import java.util.Random;
import java.util.Scanner;

public class LudoGame {
    private static final int BOARD_SIZE = 100; // Board size
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        int[] positions = new int[numPlayers]; // Array to store player positions

        boolean gameWon = false;
        int currentPlayer = 0;

        while (!gameWon) {
            System.out.println("Player " + (currentPlayer + 1) + "'s turn. Press Enter to roll.");
            scanner.nextLine();  // Wait for Enter key press

            int roll = random.nextInt(6) + 1;  // Roll between 1 and 6
            positions[currentPlayer] += roll;  // Update player position

            System.out.println("Player " + (currentPlayer + 1) + " rolled a " + roll + " and moved to position " + positions[currentPlayer]);

            if (positions[currentPlayer] >= BOARD_SIZE) {
                System.out.println("Player " + (currentPlayer + 1) + " wins!");
                gameWon = true;
            } else {
                currentPlayer = (currentPlayer + 1) % numPlayers;  // Move to the next player
            }
        }

        scanner.close();
    }
}


