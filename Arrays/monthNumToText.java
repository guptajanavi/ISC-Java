package ArrayDemo;
import java.util.*;
public class monthNumToText
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        String A[] =new String []{"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
        System.out.println(A[n-1]);
    }
}