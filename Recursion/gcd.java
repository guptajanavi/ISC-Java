import java.util.*;

public class gcd {
  public int function(int a, int b) {
    if (b == 0)
      return a;
    else
      return function(b, a % b);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    gcd ob = new gcd();
    System.out.println("Enter numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(ob.function(a, b));
  }
}