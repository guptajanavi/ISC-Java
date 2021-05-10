import java.util.*;
public class neonNumber
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int sq = (int) Math.pow(n,2);
    int sum = 0;
    while (sq != 0)
    {
      int ld = sq % 10;
      sum += ld;
      sq/=10;
    }
    if (sum == n)
    System.out.println("Neon Number");
    else
    System.out.println("Not a neon Number");
  }
}