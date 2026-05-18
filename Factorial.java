// Program to find the factorial of a number using recursion, and also to find the factorial of a number in a given range.
// TriTea@blackpharaoh

import java.util.*;

class Factorial {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else
            return n * factorial(n - 1);
    }

    static void RangeFactorial(int start, int end) {
        System.out.println("Factorial of numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i < 0) {
                System.out.println("Factorial is not defined for negative numbers. Skipping " + i);
                continue;
            }
            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Check for Factorial\n 2. Print Factorial in a Range\nEnter your choice:");
            choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Enter a number to find its factorial:");
                int num = scan.nextInt();
                if (num < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                } else {
                    System.out.println("Factorial of " + num + " is " + factorial(num));
                }
                System.out.println("Do you want to continue? (1 for yes, 0 for no)");
                choice = scan.nextInt();
                break;
            } else if (choice == 2) {
                System.out.println("Enter the start of the range:");
                int start = scan.nextInt();
                System.out.println("Enter the end of the range:");
                int end = scan.nextInt();
                if (start > end) {
                    System.out.println("Invalid range. Start should be less than or equal to end.");
                    continue;
                }
                RangeFactorial(start, end);
                System.out.println("Do you want to continue? (1 for yes, 0 for no)");
                choice = scan.nextInt();
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
                choice = 1; // Set choice to 1 to continue the loop
                break;
            }
        } while (choice == 1);

        scan.close();
    }
}