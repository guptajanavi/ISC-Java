import java.util.Scanner;

public class primeFactors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    primeFactors ob = new primeFactors();
    int num = sc.nextInt();
    for (int i = 2; i<=num; i++) {
      if (num%i == 0 && ob.ifPrime(i))
      System.out.print(i + " , ");
    }
  }
  public boolean ifPrime (int n) {
    for (int i = 2; i<n; i++) {
      if (n%i == 0)
      return false;
    }
    return true;
  }
}