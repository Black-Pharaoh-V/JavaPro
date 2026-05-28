// Program to generate a Random Password Generation System.
// TriTea@blackpharaoh

import java.util.*;
import java.io.*;
import java.security.SecureRandom;

class Password {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        // 1. Define Character pools
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digit = "1234567890";
        String Symbols = "!@#$%^&*()_+{}:<>?/.,;][|";
        String pool = uppercase + lowercase + digit + Symbols;

        System.out.println("Enter desired Password length.\n");
        int length = scan.nextInt();

        if(length < 4 || length > 10)
        {
            System.out.println("Password length should be in between 4 and 10 characters.\n");
            scan.close();
            return;
        }

        String password = "";
        for(int i=0;i<length;i++)
        {
            int randomIndex = random.nextInt(pool.length());
            password += pool.charAt(randomIndex);
        }
        System.out.println("Generated Password: "+password);

        // Save file menu prompt
        System.out.println("Do you want to save this password to 'Password.txt'?(y/n): ");
        char choice = scan.next().toLowerCase().charAt(0);
        if(choice == 'y')
        {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("Password.txt",true)))
            {
                writer.write("Password: "+password);
                writer.newLine();
                System.out.println("Success password successfully appended to 'Password.txt'.\n");
            }catch(IOException e)
            {
                System.out.println("Error writing password file:"+ e.getMessage());
            }
        }
        else
        {
            System.out.println("Password was not saved.\n");
        }
        scan.close();
    }
}