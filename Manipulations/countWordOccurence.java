package ScannerClass;
import java.util.*;
public class countWordOccurence
{
    public static void main()
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence and a word");        
        String s = sc.nextLine();
        String w = sc.next();
        Scanner sc2 = new Scanner (s);
        int ctr = 0;
        while(sc2.hasNext())
        {
            String s1 = sc2.next();
            if (s1.equalsIgnoreCase(w))
            {
                ctr++;                
            }
        }
        System.out.println("Number of times word appears equals " + ctr);
    }
}