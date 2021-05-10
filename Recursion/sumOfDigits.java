import java.util.*;

public class sumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sumOfDigits ob = new sumOfDigits();
    System.out.println("Enter a number");
    int n = sc.nextInt();
    System.out.println(ob.function(n));
  }

  public int function(int n) {
    if (n == 0)
      return 0;
    else
      return (n % 10 + function(n / 10));
  }
}
