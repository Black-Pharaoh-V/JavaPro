// Program to create a menu driven file reading system. File Handling.
// TriTea@blackpharaoh

import java.util.*;
import java.io.*;
import java.awt.Desktop;

class Reading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the file:");
        String filename = scan.nextLine();

        System.out.println("\n--File Content--\n");
        System.out.println("1. Read Contents directly in the terminal\n");
        System.out.println("2. Read content by opening file externally\n");
        System.out.println("Enter your choice:\n");
        int choice = scan.nextInt();

        File file = new File(filename);
        switch (choice) {
            case 1:
                try {
                    Scanner read = new Scanner(file);
                    System.out.println("\n-- File Content -- \n");
                    while (read.hasNextLine())
                        System.out.println(read.nextLine());
                    System.out.println("--File Content End--\n");
                    read.close();
                } catch (FileNotFoundException e) {
                    System.out.println("\n Error File not Found!");
                }
                break;

            case 2:
                // Check if desktop api is supported by the OS environment
                if (Desktop.isDesktopSupported()) {
                    Desktop desk = Desktop.getDesktop();
                    if (file.exists()) {
                        try {
                            System.out.println("Opening file externally..\n");
                            desk.open(file); // Opens OS default app.
                        } catch (IOException e) {
                            System.out.println("Error! File could not open.\n");
                        }
                    } else {
                        System.out.println("\nError! File does not exist.\n");
                    }
                } else
                    System.out.println("External file opening is not supported.\n");
                break;

            default:
                System.out.println("Invalid Input!\n");
        }
        scan.close();
    }
}