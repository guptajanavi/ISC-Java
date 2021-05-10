package StringDemo;
import java.util.*;
public class commonLetter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int i,j;
        char x,y;
        String ans="";
        System.out.println("Enter two words");
        String w1 = sc.next().toUpperCase();    
        String w2 = sc.next().toUpperCase();    
        for(i=0;i<w1.length();i++)
        {
            x=w1.charAt(i);
            if(ans.indexOf(x)==-1)
            {
                for(j=0;j<w2.length();j++)
                {
                    y=w2.charAt(j);
                    if(x==y)
                    {
                        ans+=x;
                        break;
                    }
                }   
            }
        }
        System.out.println(ans);
    }
}
