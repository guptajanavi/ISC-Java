import java.util.*;
public class sumOfArray
{
  public int function ( int A[], int i)
  {
    if ( i<0)
    return 0;
    else
    return (A[i] + function (A, i-1));
  }
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    sumOfArray ob = new sumOfArray ();
    int A [] = new int [5];
    System.out.println ("Enter array elements");
    for (int i = 0; i<5; i++)
    {
      A[i] = sc.nextInt();
    }
    System.out.println(ob.function(A, A.length-1));
  }
}