
package StringDemo;
import java.util.*;
public class stringCase
{
    public void sentenceCase(String s)
    {
        String sc = "";
        sc += Character.toUpperCase(s.charAt(0));
        for ( int i = 1; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if ( ch == '.' || ch == '!' || ch == '?')
            {
                s += ' ' + Character.toUpperCase(s.charAt(i+2));
                i += 2;
            }
            else
            {
                s += Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println(sc);
    }

    public void lowerCase(String s)
    {
        System.out.println(s.toLowerCase());
    }

    public void upperCase(String s)
    {
        System.out.println(s.toUpperCase());
    }

    public void capitaliseWord(String s)
    {
        String sc = "", nw = "";
        for (int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if ( ch != ' ')
            {
                nw = nw + ch;
                continue;
            }
            sc += Character.toUpperCase(nw.charAt(0));
            for ( int j = 1; j<nw.length(); j++)
            {
                sc += Character.toLowerCase(nw.charAt(i));
            }
        }        
        System.out.println(sc);
    }

    public void toggleCase(String s)
    {
        String sc = "";
        for ( int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if ( Character.isLowerCase(ch) == true)
            {
                sc += Character.toUpperCase(ch);
            }
            else
            {
                sc += Character.toLowerCase(ch);
            }
        }
        System.out.println(sc);
    }

    public static void main()
    {
        stringCase obj = new stringCase ();
        Scanner sc = new Scanner (System.in);
        int ch;
        do
        {           
            String s = "";
            System.out.println("Menu:" + "\n" + "1.Sentence Case" + "\n" + "2.Lower Case" + "\n" + "3.Upper Case" + "\n" + "4.Capatalise Word" + "\n" + "5.Toggle Case");
            ch = sc.nextInt();
            if ( ch>=1 && ch<=5)
            {
                System.out.println("Enter Sentences");
                s = sc.nextLine(); 
            }
            switch ( ch)
            {
                case 1: obj.sentenceCase(s);
                break;
                case 2: obj.lowerCase(s);
                break;
                case 3: obj.upperCase(s);
                break;
                case 4: obj.capitaliseWord(s);
                break;
                case 5: obj.toggleCase(s);
                break;
                case 6: System.out.println("Thank you");
                break;
                default: System.out.println("Wrong choice");
            }
        }while(ch!=6);
    }
}
 