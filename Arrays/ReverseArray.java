package DDArrayDemo;
import java.util.*;
public class ReverseArray
{
    int A[][] = new int [4][3];
    public void input()
    {
        Scanner sc = new Scanner (System.in);
        int i = 0; 
        int j = 0;
        for (i = 0; i<4; i++)
        {
            for (j = 0; j<3; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
    }

    public void print()
    {
        int i = 0;
        int j = 0;
        for (i = 3; i>=0; i--)
        {
            if (i%2 !=0)
            {
            for (j = 2; j>=0; j--)
            {
                System.out.print(A[i][j] + "\t");
            }
        }
        else
        for (j = 0; j<=2; j++)
            {
                System.out.print(A[i][j] + "\t");
            }
        
            System.out.println();
        }
    }
    
    public static void main()
    {
        ReverseArray obj = new ReverseArray();
        obj.input();
        obj.print();
    }
}