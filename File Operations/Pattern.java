package StringTokenizerDemo;

import java.util.*;
public class Pattern
{
    public void ascending(String s)
    {
        for ( int i = 0; i<s.length(); i++)
        {
            for ( int j= 0; j<=i; j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");
    }

    public void descending(String s)
    {        
        for ( int i = s.length()-1; i>=0; i--)
        {
            for ( int j= 0; j<=i; j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------"); //arranges them 
    }

    public String input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter data");
        String s = sc.nextLine();
        return s;
    }

    public void control()
    {        
        String s = input();
        StringTokenizer sc1 = new StringTokenizer (s, "-");        
        while(sc1.hasMoreTokens())
        {
            String s1 = sc1.nextToken();
            if (s1.charAt(0) < s1.charAt(1))
            {
                ascending(s1);
            }
            else
                descending(s1);
        }
    }
    
    public static void main()
    {
        Pattern ob = new Pattern ();
        ob.control();
    }
}
