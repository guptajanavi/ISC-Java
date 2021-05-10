package DDArrayDemo;
import java.util.*;
public class PrimeArray
{
    int A[] = new int [10];
    int AA[][] = new int [4][4];
    public int[] prime ()
    {
        int n = 2;
        int ctr = 0;
        int j = 0;
        while (ctr<10)
        {
            int i = 2;
            for (i=2; i<n; i++)
            {
                if (n%i==0)
                {
                    break;
                }            
            }
            if (i==n)
            {
                A[j] = n;
                j++;
                ctr++;
            }
            n++;
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
                if (i >= j)
                {
                    AA[i][j] = A[p];
                    p++;
                }
                else
                AA[i][j] = 0;
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
        PrimeArray obj = new PrimeArray();
        obj.prime();
        obj.form();
        obj.print();
    }
}