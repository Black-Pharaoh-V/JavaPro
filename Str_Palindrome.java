// Program to search and print the Palindrome word from a character matrix.
// TriTea@blackpharaoh

import java.util.*;

class Str_Palindrome {
    static void Palindrome(char g[][], int r, int c, String t) {
        int len = t.length();
        boolean fd = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j + len <= c) {
                    boolean match = true;
                    for (int k = 0; k < len; k++) {
                        if (g[i][j + k] != t.charAt(k)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        System.out.println("Found Palindrome'" + t + "' horizontally in row" + (i + 1));
                        fd = true;
                    }
                }

                if (i + len <= r) {
                    boolean match = true;
                    for (int k = 0; k < len; k++) {
                        if (g[i + k][j] != t.charAt(k)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        System.out.println("Found Palindrome'" + t + "' vertically in column" + (j + 1));
                        fd = true;
                    }
                }
            }
        }
        if (!fd) {
            System.out.println("Palindrome word" + t + " not found");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rows and columns:\n");
        int r = scan.nextInt();
        int c = scan.nextInt();

        char a[][] = new char[r][c];

        System.out.println("Enter characters row by row:\n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("A[" + i + "][" + j + "]: ");
                a[i][j] = scan.nextLine().charAt(0);
            }
        }

        System.out.print("\nEnter the palindrome word to look for:\n");
        String t = scan.nextLine();
        System.out.println("\n --Search Results--\n");
        Palindrome(a, r, c, t);
        scan.close();
    }
}