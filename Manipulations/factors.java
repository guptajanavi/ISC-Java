//displays the factors of a number
import java.util.Scanner;

public class factors {
  public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 1; i <= num; i++) {
      if (num % i == 0)
        System.out.print(i + " , ");
    }
  }
}