// Program to print the duplicate number in a single dimension array.
// TriTea@blackpharaoh

import java.util.*;

class Duplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scan.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of array:\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Element" + (i + 1));
            arr[i] = scan.nextInt();
        }

        // Sorting the array:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing Duplicate.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i] + "\n");

                while (i < (n - 1) && arr[i] == arr[i + 1])
                    i++;
            }
        }
        scan.close();
    }
}
