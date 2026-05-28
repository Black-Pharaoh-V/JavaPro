// Program to design a Rock-Paper-Scissor Game.
//TriTea@blackpharaoh

import java.util.*;

class GameRPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        // Game moves lookup
        String[] moves = { "Rock", "Paper", "Scissors" };
        System.out.println("\n--Rock-Paper-Scissors Game--\n");
        System.out.println("0. For Rock.\n");
        System.out.println("1. For Paper.\n");
        System.out.println("2. For Scissors.\n");
        System.out.println("Enter your choice:\n");
        int PChoice = scan.nextInt();

        // Validate player input
        if (PChoice < 0 || PChoice > 2) {
            System.out.println("Invalid Input!\n");
            scan.close();
            return;
        }

        int CChoice = random.nextInt();

        System.out.println("You chose: " + moves[PChoice]);
        System.out.println("Computer chose: " + moves[CChoice]);

        // Evaluate game logic.
        if (PChoice == CChoice) {
            System.out.println("\n It's a TIE");
        }
        // All Conditions where player beats computer.
        else if ((PChoice == 0 && CChoice == 2) || (PChoice == 1 && CChoice == 0) || (PChoice == 2 && CChoice == 1))
            System.out.println("\n Congratulations! You win.\n");
        else
            System.out.println("\nComputer Wins! Better luck next time.\n");

        scan.close();
    }
}