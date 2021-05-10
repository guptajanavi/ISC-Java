import java.util.*;
public class sumHalf
{
  public int calc (int A[])
  {  
    int sum = 0;
    int Lsum = 0;
    for (int i = 0; i<A.length; i++)
    {
      sum += A[i];
    }
     for (int i = 0; i <A.length; ++i) 
     {
      sum -= A[i];       
       Lsum += A[i]; 
       if (Lsum == sum)
       {
          return i; 
       } 
     }
     return -1;
  }
  public static void main (String [] args)
  {    
    sumHalf ob = new sumHalf();
    int A [] = {1,2,3,4,2};
    int k = ob.calc(A);
    if (k == -1)
    System.out.println("Does not exist");
    else
    System.out.println("Index position " + k+1);
  }
}