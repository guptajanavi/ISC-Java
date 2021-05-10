import java.util.*;
public class krishnamurthyNumber
{
  public int factorial (int n)
  {
    int f = 1;
    for ( int i = n; i>0; i--)
    {
      f = f*i;
    }
    return f;
  }
  public int sum (int n)
  {
    int sum = 0;
    while (n!=0)
    {
      int ld = n%10;
      sum += factorial(ld);
      n/=10;
    }
    return sum;
  }
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    krishnamurthyNumber ob = new krishnamurthyNumber ();
    System.out.println("Enter a number");
    int n = sc.nextInt();
    if (n == ob.sum(n))
    System.out.println("Krishnamurthy Number");
    else
    System.out.println("Not a krishnamurthy Number");
  }
}