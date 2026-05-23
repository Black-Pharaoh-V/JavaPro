// Program to print the sorted string array in alphabetical order.
// TriTea@blackpharaoh

import java.util.*;

class Str_Alpha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words do you want to enter?");
        int n = scan.nextInt();

        String A[] = new String[n];

        System.out.println("\n Enter" + n + "words\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Word" + (i + 1) + ":");
            A[i] = scan.nextLine();
        }

        // Sorting the array.
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (A[j].compareTo(A[j + 1]) > 0) {
                    String temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        System.out.println("\n Sorted String Array is:\n");
        for (int i = 0; i < n; i++)
            System.out.println(A[i] + " ");
        System.out.println();
        scan.close();
    }
}
