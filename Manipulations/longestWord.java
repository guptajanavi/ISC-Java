package ScannerClass;
import java.util.*;
public class longestWord
{
    public static void main()
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        Scanner sc2 = new Scanner (s);
        String lw = "";
        int length = 0;
        while(sc2.hasNext())
        {
            String w = sc2.next();
            if ( w.length() > length)
            {
                length = w.length();
                lw = w;
            }
        }
        System.out.println("Longest word is " + lw);        
    }
}