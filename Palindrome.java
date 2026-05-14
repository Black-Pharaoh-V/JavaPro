//Program to check whether the given number is palindrome or not, and print the palindrome in a given range.
//TriTea@blackpharaoh

import java.util.*;

class Palindrome {
    static boolean isPalindrome(int num) // Function to check whether the given number is palindrome or not
    {
        int rev = 0, temp = num;
        while (temp > 0) {
            int r = temp % 10;
            rev = rev * 10 + r;
            temp /= 10;
        }
        if (num == rev)
            return true;
        else
            return false;
    }

    static void RangePalindrome(int start, int end) // Function to print the palindrome in a given range
    {
        System.out.println("Palindrome numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Check for Palindrome\n 2. Print Palindrome in a Range\nEnter your choice:");
            choice = scan.nextInt();
            if (choice == 1) {

                int num = scan.nextInt();
                if (isPalindrome(num))
                    System.out.println(num + " is a palindrome number.");
                else
                    System.out.println(num + " is not a palindrome number.");
                System.out.println("Do you want to continue? (1 for yes, 0 for no)");
                choice = scan.nextInt();
                break;
            } else if (choice == 2) {
                int start = scan.nextInt();
                int end = scan.nextInt();
                if (start > end) {
                    System.out.println("Invalid range. Start should be less than or equal to end.");
                    continue;
                }
                RangePalindrome(start, end);
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