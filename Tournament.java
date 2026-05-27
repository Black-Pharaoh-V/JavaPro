// Program to design a tournament ranking system using Constructors.
// TriTea@blackpharaoh

import java.util.*;

class Tournament {
    String name;
    int win;
    int loss;
    int draw;
    int score;

    Tournament(String name, int win, int loss, int draw) {
        this.name = name;
        this.win = win;
        this.loss = loss;
        this.draw = draw;

        this.score = (win * 3) + (draw * 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Players in the tournament: ");
        int n = scan.nextInt();

        Tournament[] tour = new Tournament[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--Enter Stats of Player " + (i + 1) + ": --\n");
            System.out.println("Name: ");
            String name = scan.nextLine();
            System.out.println("Win: ");
            int win = scan.nextInt();
            System.out.println("Losses: ");
            int loss = scan.nextInt();
            System.out.println("Draw: ");
            int draw = scan.nextInt();

            tour[i] = new Tournament(name, win, loss, draw);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (tour[j].score < tour[j + 1].score) {
                    Tournament temp = tour[j];
                    tour[j] = tour[j + 1];
                    tour[j + 1] = temp;
                }
            }
        }

        System.out.println("\n--Leaderboard--\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + tour[i].name + " Score:" + tour[i].score + " pts" + "[W:"
                    + tour[i].win + ", L:" + tour[i].loss + ", D:" + tour[i].draw + "]");
        }
        scan.close();
    }
}