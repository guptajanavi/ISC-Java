package DDArrayDemo;
import java.util.*;
public class FibonacciArray
{
    int A[] = new int [10];
    int AA[][] = new int [4][4];
    public int[] prime ()
    {
        int n1=0;
        int n2=1;
        int n3 = 0;
        int i = 0;
        int j = 2;
        int ctr = 10; 
        A[0] = n1;
        A[1] = n2;   
        for(i=2;i<ctr;i++) 
        {    
            n3=n1+n2;    
            A[j] = n3;
            j++;
            n1=n2;    
            n2=n3;    
        }   
        return A;
    } 

    public void form ()
    {
        int i = 0;
        int j = 0;
        int p = 0;
        for ( i =0; i<4; i++)
        {
            for (j =0; j<4; j++)
            {
                if (i <= j)
                {
                    AA[i][j] = A[p];
                    p++;
                }
                else
                    AA[i][j] = -9;
            }
        }
    }

    public void print ()
    {
        {
            for (int i =0; i<4; i++)
            {
                for (int j = 0; j<4; j++)
                {
                    System.out.print(AA[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main()
    {
        FibonacciArray obj = new FibonacciArray();
        obj.prime();
        obj.form();
        obj.print();
    }
}
