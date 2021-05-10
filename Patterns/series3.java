
//Write a program to print the sum of the series: 1 + x^2/2! + x^3/3! +..... x^n/n!
import java.util.*;

public class series3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    series3 ob = new series3();
    System.out.println("Enter base and number of terms");
    double x = sc.nextInt();
    double n = sc.nextInt();
    double sum = 1;
    for (double i = 2; i <= n; i++) {
      double j = Math.pow(x, i);
      sum += j / ob.factorial(i);
    }
    System.out.println("The sum is " + sum);
  }

  public double factorial(double n) {
    double f = 1;
    for (double j = n; j > 0; j++) {
      f *= j;
    }
    return f;
  }
}