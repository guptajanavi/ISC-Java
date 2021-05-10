public class evenArray
{
  public static void main (String[] args)
  {
    int A [] = new int [10];
    int j = 0;
    int sum = 0;
    for ( int i = 0; i<A.length; i++ )
    {               
      A[i] = j;
      sum+= A[i];
      j+=2;
    }
    for (int i = 0; i<A.length; i++)
    System.out.println(A[i]);
    System.out.println("The sum is: " + sum);
  }
}