import java.util.*;
public class twistedPrime 
{
  public boolean prime(int n) 
  {
    for (int i = 2; i < n; i++) 
    {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public int reverse(int n) 
  {
    int newNum = 0;
    while (n != 0) {
      int ld = n % 10;
      newNum = newNum * 10 + ld;
      n /= 10;
    }
    return newNum;
  }

  public static void main (String [] args)
  {
    twistedPrime ob = new twistedPrime();
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int k = ob.reverse(n);
    if (ob.prime(n) == true && ob.prime(k) == true)
      System.out.println("It is a twisted prime");
    else
    System.out.println("Not a twisted prime");
  }
}