// Program to find and print the Spiral of a matrix in clock and counter clock wise.
// TriTea@blackpharaoh

import java.util.*;

class Mat_Spiral {
    static void input(int A[][], int r, int c) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows of the Matrix");
        r = scan.nextInt();
        System.out.println("Enter the columns of the Matrix");
        c = scan.nextInt();

        System.out.println("Enter the elements of the Matrix" + A);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter element[" + i + "][" + j + "]: \n");
                A[i][j] = scan.nextInt();
            }
        }
        scan.close();
    }

    static void print(int A[][], int r, int c) {
        System.out.println("Matrix" + A + "is: \n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiral_clock(int A[][], int r, int c) {
        int tp = 0, bm = r - 1, lt = 0, rt = c - 1;
        System.out.println("\nClockwise Spiral\n");

        while (tp <= bm && lt <= rt) {
            for (int i = lt; i <= rt; i++)
                System.out.print(A[tp][i] + " ");
            tp++;

            for (int i = tp; i <= bm; i++)
                System.out.print(A[i][rt] + " ");
            rt--;

            if (tp <= bm) {
                for (int i = rt; i >= lt; i--)
                    System.out.print(A[bm][i] + " ");
                bm--;
            }

            if (lt <= rt) {
                for (int i = bm; i >= tp; i--)
                    System.out.print(A[i][lt] + " ");
                lt++;
            }
        }
        System.out.println();
    }

    static void spiral_anticlock(int A[][], int r, int c) {
        int tp = 0, bm = r - 1, lt = 0, rt = c - 1;
        System.out.println("\nAnti-Clockwise Spiral\n");

        while (tp <= bm && lt <= rt) {
            for (int i = rt; i >= lt; i--)
                System.out.print(A[tp][i] + " ");
            tp++;

            for (int i = tp; i <= bm; i++)
                System.out.print(A[i][lt] + " ");
            lt++;

            if (tp <= bm) {
                for (int i = lt; i <= rt; i++)
                    System.out.print(A[bm][i] + " ");
                bm--;
            }

            if (lt <= rt) {
                for (int i = bm; i >= tp; i--)
                    System.out.print(A[i][rt] + " ");
                rt--;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[][] = new int[50][50];
        int r = 0, c = 0;

        input(A, r, c);
        print(A, r, c);

        System.out.println("\n Spiral traversal:-\n");
        System.out.println("1. Clockwise Spiral.\n");
        System.out.println("2. AntiClockwise Spiral\n");
        System.out.println("Enter your choice:\n");
        int choice = scan.nextInt();

        switch (choice) {
            case 1: {
                spiral_clock(A, r, c);
                break;
            }
            case 2: {
                spiral_anticlock(A, r, c);
                break;
            }
            default: {
                System.out.println("Invalid Input!");
            }
        }
        scan.close();
    }
}