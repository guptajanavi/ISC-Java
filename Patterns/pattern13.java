//1+2/2!-3/3!+4/4!...
import java.util.*;
public class series1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter number of terms");
    series1 obj = new series1();
    int n = sc.nextInt();    
    double sum = 1.0;
    for ( int i = 2; i<=n; i++)
    {
      sum += i/obj.getFactorial(i);
    }
  }
  public long getFactorial( int n)
  {
    long factorial = 1;
    while( n>=1)
    {
      factorial*=n;
      n--;
    }
    return factorial;
  }
}
