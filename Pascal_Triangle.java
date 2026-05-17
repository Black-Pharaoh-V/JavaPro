// Program to print Pascal's Triangle
// Tritea@blackpharaoh

import java.util.*;

class Pascal_Triangle {
    static void Pascal(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines of Pascal's Triangle: ");
        int n = scan.nextInt();
        Pascal(n);
        scan.close();
    }
}
