package StringBuffer;
import java.util.*;
class reverseNumber
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        String s = "";
        System.out.println("Enter a number");
        s = sc.next();
        StringBuffer sb = new StringBuffer (s);        
        sb.reverse();
        String s1 = sb.toString();
        if ( s.equals(s1))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}