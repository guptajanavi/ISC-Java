package ScannerClass;
import java.util.*;
public class sortShortest
{
    public static void main()
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        int n = 0;
        for (int i = 0; i<s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            n++;
        }
        String A [] = new String [n+1];
        Scanner sc2 = new Scanner (s);
        while(sc2.hasNext())
        {
            String w = sc2.next();
            int i = 0;
            A[i] = w;
            i++;
        }
        int i, j;
        for( i = 0; i<A.length; i++)
        {
            for ( j =0; j<A.length-i-1; j++)
            {
                if (A[j].length() > A[j+1].length())
                {
                    String tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmp;
                }
            }
        }
        for ( i = 0; i<A.length; i++)
        System.out.println(A[i]);
    }
}