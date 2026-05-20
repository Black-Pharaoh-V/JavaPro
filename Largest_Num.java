// Program to find the k-th Largest number in a single-dimension array.
// TriTea@blackpharaoh

import java.util.*;

class Largest_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element" + (i + 1));
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the k-th largest number to search for:\n");
        int k = scan.nextInt();
        if (k <= 0) { // condition so that the number cannot be null or negative!
            System.out.println("Invalid number!");
            scan.close();
            return;
        }

        for (int i = 0; i < n; i++) { // sorting to make the array easier to search.
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The" + k + "Largest Number is:" + arr[n - k]);
        scan.close();
    }
}