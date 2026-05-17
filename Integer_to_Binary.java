// Program to convert an integer to binary and vice versa.
// TriTea@blackpharaoh

import java.util.*;

class Integer_to_Binary {
    static int integer_to_binary(int n) { // Function to convert integer to binary
        int binary = 0, power = 1;
        while (n > 0) {
            int rem = n % 2;
            binary += power * rem;
            power = power * 10;
            n = n / 2;
        }
        return binary;
    }

    static int binary_to_integer(int binary) { // Function to convert binary to integer
        int n = 0, power = 1;
        while (binary > 0) {
            int rem = binary % 10;
            n += power * rem;
            power = power * 2;
            binary = binary / 10;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Integer to Binary \n2.Binary to Integer\n Enter your choice:\n");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter an integer: ");
                    int n = scan.nextInt();
                    int binary = integer_to_binary(n);
                    System.out.println("Binary representation: " + binary);
                    break;
                }
                case 2: {
                    System.out.print("Enter a binary number: ");
                    int binary = scan.nextInt();
                    int n = binary_to_integer(binary);
                    System.out.println("Integer representation: " + n);
                    break;
                }
            }
            System.out.println("Do you want to continue? (Press 1 for Yes, 0 for No)");
            choice = scan.nextInt(); // To check if the user wants to continue or not
        } while (choice == 1);

        scan.close();
    }
}
