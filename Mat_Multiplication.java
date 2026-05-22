// Program to calculate and perform the Matrix Multiplication in 2d Array Matrices.
// TriTea@blackpharaoh

import java.util.*;

class Mat_Multiplication {
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

    static void multiply(int A[][], int r1, int c1, int B[][], int c2, int C[][]) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A[][] = new int[50][50]; // Initializing the matrices before use.
        int B[][] = new int[50][50];
        int C[][] = new int[50][50];
        int r1 = 0, c1 = 0, r2 = 0, c2 = 0;

        input(A, r1, c1);
        input(B, r2, c2);

        if (c1 != r2) {
            System.out.println("Error! Multiplication impossible.\n");
            scan.close();
            return;
        }

        print(A, r1, c1);
        print(B, r2, c2);
        multiply(A, r1, c1, B, c2, C);
        print(C, r1, c2);

        scan.close();
    }
}