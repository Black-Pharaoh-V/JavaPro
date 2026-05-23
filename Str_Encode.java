// Program to print Run Length encoding
// TriTea@blackpharaoh

import java.util.*;
class Str_Encode
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string please:\n");
        String str = scan.nextLine();

        int len = str.length();
        int ct =1;
        String res ="";

        for(int i= 0; i<len;i++)
        {
            if(i+1 < len && str.charAt(i) == str.charAt(i+1))
            {
               ct++;
            }
            else{
                res += str.charAt(i)+ String.valueOf(ct);
                ct =1;
            }
        }
        System.out.println("Encoded string:\n"+res);
        scan.close();
    }
}
