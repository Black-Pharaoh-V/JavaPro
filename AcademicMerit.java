// Program to print the Merit List of students using constructors.
// TriTea@blackpharaoh

import java.util.*;

class AcademicMerit {
    String name;
    char grade;
    double ph;
    double ch;
    double mh;
    double ttl;
    double prt;

    AcademicMerit(String name, double p, double c, double m) {
        this.name = name;
        this.ph = p;
        this.ch = c;
        this.mh = m;

        this.ttl = p + c + m;
        this.prt = this.ttl / 3.0;

        if (this.prt >= 90.0)
            this.grade = 'A';
        else if (this.prt >= 75.0)
            this.grade = 'B';
        else if (this.prt >= 50.0)
            this.grade = 'C';
        else
            this.grade = 'F';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students:-");
        int n = scan.nextInt();
        AcademicMerit[] std = new AcademicMerit[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--Enter Student " + (i + 1) + "details--\n");
            System.out.print("Name:");
            String name = scan.nextLine();
            System.out.print("Physics Marks: ");
            double p = scan.nextDouble();
            System.out.println("Enter Chemistry:");
            double c = scan.nextDouble();
            System.out.println("Enter Maths: ");
            double m = scan.nextDouble();

            std[i] = new AcademicMerit(name, p, c, m);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (std[j].prt < std[j + 1].prt) {
                    AcademicMerit temp = std[j];
                    std[j] = std[j + 1];
                    std[j + 1] = temp;
                }
            }
        }

        System.out.println("\n--Merit List--\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ":" + std[i].name + "  Total:" + std[i].ttl + " Percentage:"
                    + String.format("%.2f", std[i].prt) + "%" + " Grade: " + std[i].grade);
        }
        scan.close();
    }
}