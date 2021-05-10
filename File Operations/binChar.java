package StringTokenizerDemo;
import java.util.*;
public class binChar
{
    public void binToChar(String s)
    {
        NumberSystem ob = new NumberSystem();
        for ( int i = 0; i<s.length(); i+=8)
        {
            int n = Integer.parseInt(s.substring(i,i+8));
            System.out.print((char)ob.binToDec(n));            
        } 
    }

    public void charToBin(String s)
    {
        NumberSystem ob = new NumberSystem();     
        for ( int i = 0; i<s.length(); i++)
        {
            int n = (int) s.charAt(i);
            System.out.print(ob.decToBin(n));
        }
    }

    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1. for name, 2. for binary");
        int ch = sc.nextInt();
        String s;
        binChar ob = new binChar();
        switch (ch)
        {
            case 1: System.out.println("Enter binary");
            s = sc.next();
            ob.binToChar(s);
            break;
            case 2: System.out.println("Enter name");
            s = sc.next();
            ob.charToBin(s);
        }
    }
}