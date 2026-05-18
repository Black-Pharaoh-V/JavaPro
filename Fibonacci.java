// Program to print fibonacci series using recursion
// TriTea@blackpharaoh

import java.util.*;

class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int num = scan.nextInt();
        if (num <= 0) {
            System.out.println("Invalid Input!");
            scan.close();
            return;
        }
        System.out.println("The series upto" + num + "terms is:");
        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scan.close();
    }
}