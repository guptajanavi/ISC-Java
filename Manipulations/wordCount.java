package ScannerClass;
import java.util.*;
public class wordCount
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        Scanner sc2 = new Scanner (s);
        int ctr = 0;
        while(sc2.hasNext())
        {
            ctr++;
        }
        System.out.println("Number of words are " + ctr);
    }
}