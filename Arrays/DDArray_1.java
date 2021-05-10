package ArrayDemo;
import java.util.*;
class DDArray_1
{    
    int A [] [] = new int [5] [5];
    public void input()
    {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter numbers");
        for ( int i = 0; i<5; i++)
        {
            for ( int j = 0; j<5; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
    }

    public void prime()
    {
        int i,j;
        int ctr = 0;
        System.out.println("Prime Numbers: ");
        for ( i = 0; i<5; i++)
        {
            for ( j = 0; j<5; j++)
            {
                int num = A[i][j];
                for ( int k = 2; k<num; k++)
                {
                    if ( num%k == 0)                 
                    {
                        ctr++;
                        break;
                    }
                }
                if ( ctr == 0)
                    System.out.println(num);
            }
            ctr = 0;
        }
    }

    public void perfect()
    {
        int i,j;
        int sum = 0;
        System.out.println("Perfect Numbers: ");
        for ( i = 0; i<5; i++)
        {
            for ( j = 0; j<5; j++)
            {
                int num = A[i][j];
                for ( int k = 1; k<num; k++)
                {
                    if ( num%k == 0)                 
                    {
                        sum += k;
                    }
                }
                if ( sum == num)
                    System.out.println(num);
            }
            sum = 0;
        }        
    }

    public void palindrome()
    {
        int i,j;
        int revNum = 0;
        System.out.println("Palindrome Numbers: ");
        for ( i = 0; i<5; i++)
        {
            for ( j = 0; j<5; j++)
            {
                int num = A[i][j];
                while ( num>0)
                {
                    int ld = num%10;
                    revNum = revNum * 10 + ld;
                    num/=10;
                }
                if ( revNum == A[i][j])
                    System.out.println(A[i][j]);
            }
            revNum = 0;
        }        
    }

    public void harshad()
    {
        int i,j;
        int sum = 0;
        System.out.println("Harshad Numbers: ");
        for ( i = 0; i<5; i++)
        {
            for ( j = 0; j<5; j++)
            {
                int num = A[i][j];
                while(num>0)
                {
                    sum += num%10;
                    num /= 10;
                }
                if ( A[i][j] % sum == 0)
                    System.out.println(A[i][j]);
                continue;
            }
            sum = 0;
        }      
    }

    public void automorphic()
    {
        int i,j;
        int ctr = 0;
        int revNum = 0;
        int square = 0;
        System.out.println("Automorphic Numbers: ");
        for ( i = 0; i<5; i++)
        {
            for ( j = 0; j<5; j++)
            {
                int num = A[i][j];
                square = num*num;
                while( num>0)
                {
                    ctr++;
                    num /= 10;
                }
                for ( int k = 0; k<ctr; k++)
                {
                    int ld = square%10;
                    revNum = ld* (int) Math.pow(10,k) + revNum;
                    square/=10;
                }
                if ( revNum == A[i][j])
                    System.out.println(A[i][j]);
            }
            revNum = 0;
        }        
    }

    public static void main()
    {
        Scanner sc = new Scanner (System.in);   
        int ch = 0;
        DDArray_1 obj = new DDArray_1();
        obj.input();
        do
        {
            System.out.println("Enter your choice");
            System.out.println("1.Prime\n2.Perfect\n3.Palindrome\n4.Harshad\n5.Automorphic\n6.Exit");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1: obj.prime();
                break;
                case 2: obj.perfect();
                break;
                case 3: obj.palindrome();
                break;
                case 4: obj.harshad();
                break;
                case 5: obj.automorphic();
                break;
                case 6: System.out.println("Thankyou!");
                break;
                default: System.out.println("Wrong choice");                
            }

        }
        while ( ch!= 6);
    }
}