//2, 6, 12, 20, 30, 42...
import java.util.*;
public class series{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter number of terms");
    int n = sc.nextInt();
    int d = 2;
    for ( int i = 2 , j = 1; j<=n ; i +=d , j++){
      System.out.print(i + " , ");
      d += 2;
    }
  }
}