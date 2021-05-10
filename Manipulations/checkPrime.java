//checks whether a number is prime or not
import java.util.*;

public class checkPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int ctr = 0;
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        ctr++;
      break;
    }
    if (ctr == 0)
      System.out.println("Prime number");
    else
      System.out.println("Not a Prime number");
  }
}