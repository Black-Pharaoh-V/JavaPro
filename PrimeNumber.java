//Program to check whether a number is prime or not, and also print Prime numbers in a given range.
//TriTea@blackpharaoh

import java.util.*;

class PrimeNumber {
    static Integer isPrime(int num) // Function to check Prime
    {
        if (num <= 1) {
            return 0; // not Prime
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0)
                return 0;
        }
        return 1; // Is Prime
    }

    static void RangePrime(int f, int l) // Function to print Prime numbers in a given range
    {
        System.out.println("Prime numbers between " + f + " and " + l + " are:");
        for (int i = f; i <= l; i++) {
            if (isPrime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println(
                    "1. Check if a number is prime \n 2. Print prime number in a given range. \n Enter your choice: \n");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    int num;
                    System.out.print("Enter a number: ");
                    num = scan.nextInt();
                    if (isPrime(num) == 1)
                        System.out.println(num + " is a prime number.");
                    else
                        System.out.println(num + " is not a prime number.");
                    break;
                case 2:
                    int f, l;
                    System.out.print("Enter the starting number of the range: ");
                    f = scan.nextInt();
                    System.out.print("Enter the ending number of the range: ");
                    l = scan.nextInt();
                    if (f > l) {
                        System.out.println(
                                "Invalid range. Starting number should be less than or equal to ending number.");
                        break;
                    }
                    RangePrime(f, l);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
            System.out.println("Enter 1 to continue or 0 to exit: \n");
        } while (choice == 1);
        scan.close();
    }
}
