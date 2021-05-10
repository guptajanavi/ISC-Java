// finds the sum of even and odd terms in an array
import java.util.*;
public class evenOddSum{
  public static void main (String [] args){
    int A [] = new int [10];
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter terms of array");
    for (int i = 0; i<A.length; i++){
      A[i] = sc.nextInt();
    }
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i<A.length; i++){
      if (A[i]%2 == 0)
      evenSum += A[i];
      else
      oddSum += A[i];
    }
    System.out.println("Sum of odd number is "+ oddSum);
    System.out.println("Sum of even number is "+ evenSum);
  }
}