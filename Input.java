// Program for Writing to a file . File Handling
// TriTea@blackpharaoh

import java.util.*;
import java.io.*;

class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of the file to create (e.g. File.txt): ");
        String filename = scan.nextLine();
        // Clear the remaining newline character from the scanner buffer
        scan.nextLine();

        try {
            FileWriter write = new FileWriter(filename);

            // Ask user to write into the file
            System.out.println("\nEnter the text you want to save to the file:");
            String text = scan.nextLine(); // Reads the whole line with spaces

            write.write(text);
            write.close();

            System.out.println("\nSuccess your text has been written to '" + filename + "'. ");
        } catch (IOException e) {
            System.out.println("An error occured while creating or writing to the file.");
        }
        scan.close();
    }
}