public class naturalArray
{
  public static void main(String[] args)
  {
    int A [] = new int [10];
    
    int oddSum = 0;
    int evenSum = 0;    
    for ( int i =0; i<A.length; i++)
    {
      A[i] = i+1;
      if ( A[i] % 2 == 0)
      evenSum += A[i];
      else
      oddSum += A[i];
    } 
    System.out.println("The odd sum is " + oddSum);
    System.out.println("The even sum is " + evenSum);
    
  }
}