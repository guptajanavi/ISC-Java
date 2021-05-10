import java.util.*;

public class power {
  public int function(int p, int n) {
    if (p <= 1)
      return n;
    else
      return (n * function(p - 1, n));
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    power ob = new power();
    System.out.println("Enter a number and power");
    int n = sc.nextInt();
    int p = sc.nextInt();
    System.out.println(ob.function(p, n));
  }
  /*
   * public int function (int p, int n) { if (p<1) return 1; else return (n *
   * function (p-1, n)); }
   */
}