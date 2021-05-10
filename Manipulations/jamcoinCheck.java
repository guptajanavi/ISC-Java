import java.util.*;
public class jamcoinCheck
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a string");
    String s = sc.next();
    jamcoinCheck ob = new jamcoinCheck();
    int ctr = 0;
    if (ob.digiCheck(s) == false)
    ctr++;
    for ( int i=2; i<11; i++)
    {
      if (ob.checkPrime(ob.binToDec(Integer.parseInt(s), i)) == true)
      {
        ctr++;    
        break;
      }      
    }
    if (ctr==0)
    System.out.println(s + " is a valid jamcoin");
    else
    System.out.println(s + " is not a valid jamcoin");
    
  }

  public boolean digiCheck(String s)
  {
    if (s.charAt(0)!= '1' || s.charAt(s.length()-1)!= '1')
    return false;
    for ( int i = 0; i<s.length(); i++)
    {
      if (s.charAt(i)!= '0' && s.charAt(i)!= '1')
      return false;
    }
    return true;
  }

  public int binToDec(int n, int k)
  {    
    int j = 1;
    int dec = 0;
    for ( int i =0 ; i<8; i++)
    {
      int ld = n%10;
      dec += ld*j;
      j *= k;
      n /= 10;
    }
    System.out.println("In base " + k + " = "+ dec);
    return dec;
  }

  public boolean checkPrime( int n)
  {
    int ctr = 0;
    for (int i = 2; i<n; i++)
    {
      if (n%i == 0)
      {
        ctr++;
        break;
      }
    }
    if (ctr==0)
    return true;
    return false;
    }
  }