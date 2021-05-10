//obtains the GCD of two number
import java.util.*;
public class getGCD{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int num1, num2, i;
    System.out.println("Enter two numbers");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    for ( i = Math.min(num1, num2); i>0; i--){
      if ( num1% i == 0 && num2% i == 0)
      break;
    }
    System.out.println("GCD is " + i);
  }
}