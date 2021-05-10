import java.util.*;

public class factorial {
  public int function(int num) {
    if (num <= 1)
      return 1;
    else
      return (num * function(num - 1));
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    factorial ob = new factorial();
    System.out.println("Enter number");
    int num = sc.nextInt();
    System.out.println(ob.function(num));
  }
}
