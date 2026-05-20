// Program to find the Majority Number in a single dimension array. 
// TriTea@blackpharaoh

import java.util.*;

class Majority_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element" + (i + 1));
            arr[i] = scan.nextInt();
        }

        // Applying Selection sorting.
        for (int i = 0; i < n - 1; i++) {
            int md = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[md]) {
                    md = j;
                }
            }
            int temp = arr[md];
            arr[md] = arr[i];
            arr[i] = temp;
        }

        int cd = arr[n / 2];
        int f = -1, l = -1;
        int low, high, mid;

        // Applying Binary Searching.
        low = 0;
        high = n - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == cd) {
                f = mid;
                high = mid - 1;
            } else if (arr[mid] > cd)
                high = mid - 1;
            else
                low = mid + 1;
        }

        low = 0;
        high = n - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == cd) {
                l = mid;
                low = mid + 1;
            } else if (arr[mid] > cd)
                high = mid - 1;
            else
                low = mid + 1;
        }

        // Checks total freq. against majority condition.
        int ct = l - f + 1;

        if (ct > n / 2) {
            System.out.println("\n THe Majority Element is" + cd + "(appears" + ct + "times)");
        } else {
            System.out.println("No Majority element present!");
        }
        scan.close();
    }
}