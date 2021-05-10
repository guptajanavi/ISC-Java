
// 1 + 2/2! + 3/3! + 4/4!... n/n!
import java.util.*;

public class series2 {
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    series2 ob = new series2();
    System.out.println("Enter number of terms");
    int n = sc.nextInt();
    double sum = 1;
    for (int i = 2; i<n; i++){
      double term = i/ob.factorial(i);
      sum += term;
    }
    System.out.println("The sum is" + sum);
  }
  public double factorial (int n){
    double f = 1;
    for (int i = n; i>0; i--){
      f *= (double)i;
    }
    return f;
  }
}