// Program to Rotate a matrix in different degrees.
// TriTea@blackpharaoh

import java.util.*;

class Mat_Rotate {
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

    static void rotate_r90(int A[][], int r, int c, int B[][], int nr, int nc) {
        nr = c;
        nc = r;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[j][r - 1 - i] = A[i][j];
            }
        }
    }

    static void rotate_r180(int A[][], int r, int c, int B[][], int nr, int nc) {
        nr = r;
        nc = c;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[r - 1 - i][c - 1 - j] = A[i][j];
            }
        }
    }

    static void rotate_r270(int A[][], int r, int c, int B[][], int nr, int nc) {
        nr = c;
        nc = r;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[c - 1 - j][i] = A[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[][] = new int[50][50];
        int R[][] = new int[50][50];

        int r = 0, c = 0, nr = 0, nc = 0;
        int choice;

        System.out.println("\n ---Rotate matrix in following order---\n");
        System.out.println("1.Rotate Left 90 degree.");
        System.out.println("2.Rotate Left 180 degree.");
        System.out.println("3.Rotate Left 270 degree.");
        System.out.println("4.Rotate Right 90 degree.");
        System.out.println("5.Rotate Right 180 degree.");
        System.out.println("6.Rotate Right 270 degree.");
        System.out.println("Enter your choice:\n");
        choice = scan.nextInt();

        switch (choice) {
            case 1: {
                rotate_r270(A, r, c, R, nr, nc);
                break;
            }
            case 2: {
                rotate_r180(A, r, c, R, nr, nc);
                break;
            }
            case 3: {
                rotate_r90(A, r, c, R, nr, nc);
                break;
            }
            case 4: {
                rotate_r90(A, r, c, R, nr, nc);
                break;
            }
            case 5: {
                rotate_r180(A, r, c, R, nr, nc);
                break;
            }
            case 6: {
                rotate_r270(A, r, c, R, nr, nc);
                break;
            }
            default: {
                System.out.println("\n Invalid Input!");
                scan.close();
                return;
            }
        }

        System.out.println("\nOriginal Matrix:\n");
        print(A, r, c);
        System.out.println("\nRotated Matrix:\n");
        print(R, nr, nc);
        scan.close();
    }
}
