import java.util.*;
public class sumOfDiagonals
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    int A [] [] = new int [4] [4];
    System.out.println("Enter array elements");
    for ( int i = 0; i<A.length; i++)
    {
      for ( int j = 0; j<A[i].length; j++)
      {
        A[i][j] = sc.nextInt();
      }
    }
      for ( int i = 0; i<A.length; i++)
    {
      for ( int j = 0; j<A[i].length; j++)
      {
        System.out.print(A[i][j] + "\t");
      }
      System.out.println();
    }
    int sum = 0;
    for ( int i = 0; i<A.length; i++ )
    {
      sum += A[i] [i];
    }
    System.out.println("Sum is " + sum);
    sum = 0;
    for ( int i = 0; i<A.length; i++)
    {
        sum += A[i] [A.length-1-i];
    }
    System.out.println("Sum is " + sum);
  }
}