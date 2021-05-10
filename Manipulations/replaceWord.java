package ScannerClass;
import java.util.*;
public class replaceWord
{
    public static void main()
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence and two words");        
        String s = sc.nextLine();
        String w = sc.next();
        String w2 = sc.next();
        Scanner sc2 = new Scanner (s);
        int ctr = 0;
        String replace = "";
        while(sc2.hasNext())
        {
            String s1 = sc2.next();
            if (s1.equalsIgnoreCase(w))
            replace += w2 + " ";
            else
            replace += s1 + " ";
        }
        System.out.println(replace);
    }
}