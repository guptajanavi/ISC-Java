//efficiently obtains and displays the factors of a number
import java.util.*;

public class factorsEfficient {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    for (int k = 1; k <= Math.pow(num, 0.5); k++)
      if (num % k == 0) {
        System.out.print(k + ",\t" + num / k + ",\t");
      }
  }
}