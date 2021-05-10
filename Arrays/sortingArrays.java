import java.util.*;
public class sortingArrays
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter array elements");
    int A [] = new int [5];
    for ( int i = 0; i<A.length; i++)
    {
      A[i] = sc.nextInt();
    }
    System.out.println("Enter 1.for selection sort, 2.bubble sort, 3. insertion sort, 4.exchange selection sort");
    int ch = sc.nextInt();
    
  }
}