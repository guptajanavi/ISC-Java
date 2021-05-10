

package ArrayDemo;
import java.util.*;
public class magicNumber
{
    public boolean checkMagic( int n)
    {
        int dig = sumOfDigits(n);
        while(dig>9)
        {
            dig = sumOfDigits(dig);
        }
        if (dig == 1)
            return true;
        else
            return false;
    }

    public int sumOfDigits(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        magicNumber obj = new magicNumber();
        System.out.println("Enter choice:");
        System.out.println("1.Check magic number\n2.Print magic number from 1 to n1\n3.Print magic number from n1 to n2\n4.count magic numbers\n5.Store numbers in 1D array\n6.Store numbers in DD array\n7.Exit");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter a number");
            int n = sc.nextInt();          
            if (obj.checkMagic(n) == true)
                System.out.println("Magic number");
            else
                System.out.println(" Not a Magic number");
            break;
            case 2: System.out.println("Enter limit");
            n = sc.nextInt();  
            for ( int  i = 0; i<=n; i++)
            {
                if ( obj.checkMagic(i) == true)
                    System.out.println(i);
            }
            break;
            case 3: System.out.println("Enter 2 limits");
            n = sc.nextInt(); 
            int n2 = sc.nextInt();
            for ( int  i = Math.min(n,n2); i<=Math.max(n,n2); i++)
            {
                if ( obj.checkMagic(i) == true)
                    System.out.println(i);
            }
            break;
            case 4: System.out.println("Enter 2 limits");
            n = sc.nextInt(); 
            n2 = sc.nextInt();
            int ctr = 0;
            for ( int  i = Math.min(n,n2); i<=Math.max(n,n2); i++)
            {
                if ( obj.checkMagic(i) == true)
                    ctr++;
            }
            System.out.println("Number of magical numbers are " + ctr);           
            break;
            case 5: System.out.println("Enter number of terms");
            n = sc.nextInt();
            int A [] = new int [n];
            int num = 1;
            for ( int i = 0; i<A.length;)
            {
                if ( obj.checkMagic(num) == true)
                {
                    A[i] = num;
                    i++;
                }
                num++;
            }
            for ( int i = 0; i<A.length; i++)
            {
                System.out.println(A[i]);                
            }
            break;
            case 6: System.out.println("Enter number of terms");
            n = sc.nextInt();
            ctr = 0;
            int ll = 0;
            int hl = 0;
            for ( int i =2; i<n; i++)
            {
                if( n%i == 0)
                {
                    ctr++;
                    break;                
                }
            }
            if ( ctr == 0)
            {
                ll = 1;
                hl = n;
            }
            else if(n%2 == 0)
            {
                ll = 2;
                hl = n/2;
            }
            else if(n%3 == 0)
            {
                ll = 3;
                hl = n/3;
            }
            else if(n%5 == 0)
            {
                ll = 5;
                hl = n/5;
            }                
            int A1 [][] = new int [ll][hl];  
            num = 1;
            int j = 0;
            for ( int i = 0; i<ll; i++)
            {
                for ( j = 0; j<hl;)
                {
                    if ( obj.checkMagic(num) == true)
                    {
                        A1[i][j] = num;
                        j++;
                    }
                    num++;
                }
            }
            for ( int i = 0; i<ll; i++)
            {
                for ( j = 0; j<hl; j++)
                {
                    System.out.print(A1[i][j] +" ");                
                }
                System.out.println();
            }
            break;
            case 7: System.out.println("Thank you.");
        }
    }
}