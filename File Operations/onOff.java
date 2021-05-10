package StringTokenizerDemo;

import java.util.*;
public class onOff
{
    public String input()
    {
        Scanner sc = new Scanner (System.in); Scanner ssc = new Scanner (System.in); System.out.println("Enter a number or text");
        System.out.println("Enter data"); String s1 = sc.nextLine();
        String s = sc.nextLine(); 
        return s;
    }

    public void control()
    {
        String s = input();
        System.out.println("Enter 1. for text to number and 2. for number to text");
        Scanner sc = new Scanner (System.in);
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:    
            StringTokenizer sc1 = new StringTokenizer (s, "o");
            while (sc1.hasMoreTokens())
            {
                String s1 = sc1.nextToken();
                if ( s1.charAt(0) == 'f')
                    off();
                else
                    on();

            }       
            break;
            case 2: 
            for ( int i = 0; i<s.length(); i++)
            {
                if (s.charAt(i) == '0')
                zero();
                else
                one();
            }
        }
    }

    public void on()
    {        
        System.out.print("1");
    }

    public void off()
    {        
        System.out.print("0");
    }
    
    public void zero()
    {
        System.out.print("off");
    }
    
        public void one()
    {
        System.out.print("on");
    }

    public static void main()
    {
        onOff ob = new onOff ();
        ob.control();
    }
}