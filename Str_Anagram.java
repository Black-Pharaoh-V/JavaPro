// Program to compare two strings for Anagram.
// TriTea@blackpharaoh

import java.util.*;

class Str_Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first String:\n");
        String s1 = scan.nextLine();
        System.out.println("Enter second string:\n");
        String s2 = scan.nextLine();

        // length must be same.
        if (s1.length() != s2.length()) {
            System.out.println("\n The Strings are not Anagram.\n");
            scan.close();
            return;
        }

        // Match and eliminate characters.
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            String ltr = String.valueOf(c);

            if (s2.contains(ltr)) {
                s2 = s2.replaceFirst(ltr, "");
            } else {
                System.out.println("\n The Strings are not Anagram.\n");
                scan.close();
                return;
            }
        }

        // If all char matched and removed s2 will be empty.
        if (s2.isEmpty()) {
            System.out.println("\n The strings are Anagram.\n");
        } else {
            System.out.println("\n The strings are not Anagram\n");
        }
        scan.close();
    }
}