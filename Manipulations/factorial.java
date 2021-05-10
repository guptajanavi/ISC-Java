//obtains the factorial of a number
import java.util.*;
public class factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int factorial = 1;
    while( n>=1) {
      factorial*=n;
      n--;
    }
    System.out.println("The factorial is " + factorial);
  }
}