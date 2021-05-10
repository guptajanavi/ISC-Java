package ScannerClass;
import java.util.*;
public class countVowels
{
    public static void main()
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence");        
        String s = sc.nextLine();
        s = s.toUpperCase();
        Scanner sc2 = new Scanner (s);        
        while(sc2.hasNext())
        {
            String w = sc2.next();  
            int ctr = 0;
            for (int i = 0; i<w.length(); i++)
            { 
                char ch = w.charAt(i);
                if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                ctr++;
            }
            System.out.println("Number of vowels in " + w + " is " + ctr);
        }        
    }
}