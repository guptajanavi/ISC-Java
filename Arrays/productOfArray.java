import java.util.*;
public class productOfArray
{
  public static void main (String [] args)
  {
    int i,j=0;
    int prod = 1;
    int A [] = {1,2,3,4,5};
    int AA [] = new int [5];
    for (i = 0; i<A.length; i++)
    {
      for (j=0; j<A.length; j++)
      {
        if (j != i)
        prod *= A[j];
      }      
      AA [i] = prod;
      prod = 1;
    }
    for (i=0; i<A.length; i++)
    {
      System.out.println(AA[i]);
    }
  }
}