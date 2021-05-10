//checks whether a number is armstrong or not
import java.util.*;

public class checkArmstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int temp = n;
    int ctr = 0;
    int sum = 0;
    while (temp != 0) {
      ctr++;
      temp /= 10;
    }
    temp = n;
    while (temp != 0) {
      int ld = temp % 10;
      sum += Math.pow(ld, ctr);
      temp /= 10;
    }
    if (sum == n)
      System.out.println("Armstrong number");
    else
      System.out.println("Not an Armstrong number");
  }
}