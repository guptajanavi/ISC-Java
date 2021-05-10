import java.util.*;
public class mergeArrayDouble
{
  public static void main (String[] args)
  {
    int A1 [] = {1,2,3,4,5,11};
    int A2 [] = {6,7,8,9,10,12};
    int A3 [] = new int [12];
    int a = 0, b = 0, ctr = 0;;
    for ( int i = 0; i<A3.length; i=i+2)
    {
      if ( a<A1.length && b<A2.length)
      {
        if ( ctr % 2 == 0)
        {
          A3[i] = A1[a];
          A3[i+1] = A1[a+1];
          a+=2;
          System.out.print(A3[i]);
          System.out.println(A3[i+1]);
        }
        else
        {
          A3[i] = A2[b];
          A3[i+1] = A2[b+1];
          b+=2;
          System.out.print(A3[i]);
          System.out.println(A3[i+1]);
        }        
      }
      ctr++;
    }
    for ( int i = 0; i<A3.length; i++)
    {
      System.out.print(A3[i] + "  ");
    }     
  }
}