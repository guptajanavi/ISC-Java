package DDArrayDemo;
import java.util.*;
class DDArray_2
{
    int A[] [];
    public void accept(int n)
    {
        {
            A = new int [n][n];
            int r, c;
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter 25 numbers ");
            for ( r=0; r<A.length; r++)
            {
                for ( c=0; c<A[r].length; c++)
                {
                    A[r][c] = sc.nextInt();
                }
            }
        }
    }

    public void print()
    {
        int r,c;
        for ( r=0; r<A.length; r++)
        {
            for ( c=0; c<A[r].length; c++)
            {
                System.out.print(A[r][c] + "\t");
            }
            System.out.println();
        }
    }
    
    public int sign(int n)    
    {           
        if ( n>0) 
        return 1;
        else if ( n == 0) 
        return 0;
        else 
        return -1; 
    }

    public void reverse()
    {
        int r,c;
        System.out.println("Reversed array is ");
        for ( r=A.length-1; r>=0; r--)
        {
            for ( c=A[r].length-1; c>=0; c--)
            {
                System.out.print(A[r][c] + "\t");
            }
            System.out.println();
        }    
    }

    public static void main()
    {
    }
}
