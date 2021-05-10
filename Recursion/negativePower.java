import java.util.*;
public class negativePower
{
  public double function (double n, double p)
  {
    if (p > -1)
    return 1;
    else
    return ( n * function (n, p+1));
  }
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    negativePower ob = new negativePower();
    System.out.println("Enter a number and power");
    double n = sc.nextDouble();
    double p = sc.nextDouble();
    System.out.println(1/ob.function(n,p));
  }

}
