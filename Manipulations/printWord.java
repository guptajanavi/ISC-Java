package ScannerClass;
import java.util.*;
public class printWord
{
    public static void main()
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        Scanner sc2 = new Scanner (s);
        while(sc2.hasNext())
        {
            String w = sc2.next();
            System.out.println(w);
        }
    }
}