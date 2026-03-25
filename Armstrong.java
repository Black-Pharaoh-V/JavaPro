import java.util.*;

class Armstrong {

    static void VerifyArm(int n) {
        int sum = 0, temp, r;
        temp = n;
        while (temp != 0) {
            r = temp % 10;
            sum += r * r * r;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong Number.");
        } else
            System.out.println(n + " is not an Armstrong Number.");
    }

    static void RangeArm(int f, int l) {
        int sum, temp, r;
        for (int i = f; i <= l; i++) {
            temp = i;
            sum = 0;
            while (temp != 0) {
                r = temp % 10;
                sum += r * r * r;
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch, ct;
        do {
            System.out.println("Enter your choice please: \n 1. Verify a Number \n 2.Find a given range.");
            ch = scan.nextInt();
            if (ch == 1) {
                System.out.println("Enter the number to verify: ");
                int num = scan.nextInt();
                VerifyArm(num);
                System.out.println("Press 1 to continue or 0 to exit:");
                ct = scan.nextInt();
            } else if (ch == 2) {
                System.out.println("Enter the range to find Armstrong numbers: ");
                System.out.println("From: ");
                int f = scan.nextInt();
                System.out.println("To: ");
                int l = scan.nextInt();
                RangeArm(f, l);
                System.out.println("Press 1 to continue or 0 to exit:");
                ct = scan.nextInt();
            } else {
                System.out.println("Invalid Choice! Please try again..");
                System.out.println("Press 1 to continue or any key to exit:");
                ct = scan.nextInt();
            }
        } while (ct == 1);
    }
}