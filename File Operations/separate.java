package StringTokenizerDemo;
import java.util.*;
public class separate
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter data");
        String s = sc.nextLine();
        System.out.println("Name\tGender\tAge\tScience\tComputer\tTotal");      
        StringTokenizer st = new StringTokenizer (s,"~");
        String w = "";
        int ctr = st.countTokens();        
        while (st.hasMoreTokens())
        {
            double total = 0.0;
            int ctr2 = 0;
            w = st.nextToken();
            Scanner sc2 = new Scanner (w);
            while ( sc2.hasNext())            
            {
                String w1 = sc2.next();
                ctr2++;
                System.out.print(w1 + "\t");
                if ( ctr2 == 4 || ctr2 == 5)
                    total += Double.parseDouble(w1);
            }
            System.out.println(total);
        }
        System.out.println("Number of students are: " + ctr);
    }
}