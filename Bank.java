// Program to create a bank account with user details using constructors.
// TriTea@blackpharaoh

import java.util.*;

class Bank {
    int acc;
    String own;
    double bal;

    Bank(int accNum, String name, double balance) {
        acc = accNum;
        own = name;
        bal = balance;
    }

    void display() {
        System.out.print("Acc No." + acc + "\t Name:" + own + "\t Balance:" + bal + "\tStatus: ");
        if (bal >= 500.0) {
            System.out.println("Minimum Balance Maintained.\n");
        } else {
            System.out.println("Low Balance.\n");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many accounts you want to create?");
        int n = scan.nextInt();
        Bank a[] = new Bank[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--Enter Bank Details" + (i + 1) + "--\n");
            System.out.println("Enter Account Number:\n");
            int accNum = scan.nextInt();

            System.out.println("Enter Owner Name:\n");
            String name = scan.nextLine();

            System.out.println("Enter the balance:\n");
            double balance = scan.nextDouble();

            a[i] = new Bank(accNum, name, balance);
        }

        System.out.println("--All Accounts Details--\n");
        for (int i = 0; i < n; i++) {
            a[i].display();
        }
        scan.close();
    }
}