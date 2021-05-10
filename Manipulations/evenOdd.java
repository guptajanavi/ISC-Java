//checks whether a number is an even or an odd number
import java.util.*;
class evenOdd {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    if ( n%2 == 0)
    System.out.println("even");
    else
    System.out.println("odd");
  }
}