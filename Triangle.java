// Program to validate and Print a triangle using constructors.
// TriTea@blackpharaoh 

import java.util.*;

class Triangle {
    double sa;
    double sb;
    double sc;

    Triangle(double sideA, double sideB, double sideC) {
        sa = sideA;
        sb = sideB;
        sc = sideC;
    }

    void Validate() {
        System.out.print("Sides: " + sa + ", " + sb + ", " + sc + " Result: ");
        if ((sa + sb > sc) && (sb + sc > sa) && (sa + sb > sc)) {
            // Classification matching rule
            if (sa == sb && sa == sc) {
                System.out.println("Valid-> Equilateral Triangle");
            } else if (sa == sb || sb == sc || sa == sc) {
                System.out.println("valid-> Isosceles Triangle");
            } else {
                System.out.println("Valid-> Scalene Triangle");
            }
        } else {
            System.out.println("Invalid -> Not a Triangle\n");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many triangles do you want to validate?");
        int n = scan.nextInt();
        Triangle tri[] = new Triangle[n];

        // Gathering loop
        for (int i = 0; i < n; i++) {
            System.out.println("\n--Enter 3 sides of a triangle " + (i + 1) + "--\n");
            System.out.println("side A:");
            double a = scan.nextDouble();
            System.out.println("side B:");
            double b = scan.nextDouble();
            System.out.println("side C:");
            double c = scan.nextDouble();

            tri[i] = new Triangle(a, b, c);
        }

        System.out.println("\n--Validation Result--\n");
        for (int i = 0; i < n; i++) {
            tri[i].Validate();
        }
        scan.close();
    }
}