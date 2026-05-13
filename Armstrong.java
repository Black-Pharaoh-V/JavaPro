import java.util.*;

// Program to check if a number is an Armstrong number or not and to find all the Armstrong numbers in a given range.
// TriTea@blackpharaoh
class Armstrong {

    // The single source of truth for Armstrong logic
    static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        // Calculate number of digits (the power)
        int digits = String.valueOf(n).length();

        while (temp != 0) {
            int r = temp % 10;
            // Math.pow returns a double, so we cast it to int
            sum += Math.pow(r, digits);
            temp /= 10;
        }
        return sum == n;
    }

    static void VerifyArm(int n) {
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is not an Armstrong Number.");
        }
    }

    static void RangeArm(int f, int l) {
        System.out.print("Armstrong numbers in range: ");
        for (int i = f; i <= l; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch, ct = 0;
        
        do {
            System.out.println("\nEnter your choice please: \n 1. Verify a Number \n 2. Find a given range. \n 3. Exit");
            ch = scan.nextInt();

            if (ch == 1) {
                System.out.println("Enter the number to verify: ");
                int num = scan.nextInt();
                VerifyArm(num);
                System.out.println("Press 1 to continue or 0 to exit:");
                ct = scan.nextInt();
            } else if (ch == 2) {
                System.out.println("Enter the range to find Armstrong numbers: ");
                System.out.print("From: ");
                int f = scan.nextInt();
                System.out.print("To: ");
                int l = scan.nextInt();
                
                if (f > l) {
                    System.out.println("Invalid Range! Please try again..");
                    ct = 1; // Set to 1 so the loop continues
                    continue;
                }
                RangeArm(f, l);
                System.out.println("Press 1 to continue or 0 to exit:");
                ct = scan.nextInt();
            } else if (ch == 3) {
                ct = 0;
            } else {
                System.out.println("Invalid Choice! Please try again..");
                ct = 1;
            }
        } while (ct == 1);
        
        scan.close(); 
    }
}