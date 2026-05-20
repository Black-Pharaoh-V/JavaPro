// Program to find and solve the 3-Sum problem in a 1D Array.
// TriTea@blackpharaoh

import java.util.*;

class Three_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element:" + i + 1);
            arr[i] = scan.nextInt();
        }

        // Using Selection sorting
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
        System.out.println("\nTriplets that sum to 0 are:\n");
        boolean fd = false;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println("[" + arr[i] + "," + arr[left] + "," + arr[right] + "]");
                    fd = true;

                    while (left < right && arr[left] == arr[left + 1])
                        left++;
                    while (left < right && arr[right] == arr[right - 1])
                        right--;

                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }

        if (!fd)
            System.out.println("Triplet not found!");
        scan.close();
    }
}