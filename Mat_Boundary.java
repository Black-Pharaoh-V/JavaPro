// Program to Print Boundary and Non Boundary element from a 2d Array.
// TriTea@blackpharaoh 

import java.util.*;

class Mat_Boundary {
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

    static void boundary(int A[][], int r, int c) {
        System.out.println("\n Boundary Elements:\n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1)
                    System.out.print(A[i][j] + " ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void non_boundary(int A[][], int r, int c) {
        System.out.println("\n Boundary Elements:\n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i != 0 && i != r - 1 && j != 0 && j != c - 1)
                    System.out.print(A[i][j] + " ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int A[][] = new int[50][50];
        int r = 0, c = 0;

        input(A, r, c);
        print(A, r, c);
        boundary(A, r, c);
        non_boundary(A, r, c);
    }
}
