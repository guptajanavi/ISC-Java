import java.util.*;
public class numberSum
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int tmp = n;
    int ctr = 0;
    while(tmp != 0)
    {
          ctr++;
          tmp/=10;
    }
    int sum = 0;
    tmp = n;
    while ( ctr != 0)
    {
      int ld = tmp%10;
      sum += Math.pow(ld, ctr);
      tmp/=10;
      ctr--;
    }
    if ( sum == n)
    System.out.println("True");
    else
    System.out.println("False");
  }
}