import java.util.*;

public class fibonacci {
  public int function(int num) {
    if (num == 1)
      return 0;
    else if (num == 2)
      return 1;
    else
      return (function(num - 1) + function(num - 2));
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    fibonacci fb = new fibonacci();
    System.out.println("Enter a number");
    int num = sc.nextInt();
    System.out.println(fb.function(num));
  }
}
