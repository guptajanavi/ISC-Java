import java.util.*;
public class Bank
{
    static int AccNo=0;
    int customerID;
    double balance;
    String name;

    public Bank()
    {
      AccNo=0;
      customerID=0;
      balance=0.0;
      name="";
    }

    public Bank(int customerID, double balance, String name)
    {
      this.AccNo=AccNo;
      this.customerID=customerID;
      this.balance=balance;
      this.name=name;
    }
    public void maininput()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your customer id");
      customerID = sc.nextInt();
      System.out.println("Enter your name");
      name = sc.nextLine();
      System.out.println("Enter current balanace");
      balance =sc.nextDouble();
    }

    public void input()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("1 for deposit, 2 for withdrawal, 3 to check balance");
      ch = sc.nextInt();
    }
    public void deposit(double n)
    {
      balance+=n;
    }
    public void withdraw (double n)
    {
      balance-=n;
    }
    public double checkBalance()
    {
      return balance;
    }
    public static void main(String[] args)
    {
      Bank[] b = new Bank[3];
      for(int i = 0; i<b.length; i++)
      {
        b[i] = new Bank();
        b[i].maininput();
        b[i].input();
        System.out.println("Balance is " + b[i].checkBalance() + "and account number is " + Accno);
      }
        
    }
}