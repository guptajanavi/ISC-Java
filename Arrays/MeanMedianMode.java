package ArrayDemo;
import java.util.*;
public class MeanMedianMode
{
    int A[];
    public void input() 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        A = new int [n];
        System.out.println("Enter values of array");
        for ( int i = 0; i<A.length; i++)
        {
            A[i] = sc.nextInt();
        }
    }

    public void mean()
    {
        double sum = 0.0;
        for ( int i = 0; i<A.length; i++)
        {
            sum += A[i];
        }
        System.out.println("Mean is " + sum/A.length);
    }

    public void sort()
    {
        for (int i = 0; i<A.length; i++)
        {
            for ( int j = 0; j<A.length-i-1; j++)
            {
                if (A[j] > A[j+1])
                {
                    int tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmp;
                }
            }
        }
    }

    public void median()
    {

        if (A.length%2 == 0)
        {
            int position = (A.length/2);
            double median = 0.5 * ( A[position] + A[position-1]);
            System.out.println("Median is " + median);
        }
        else
        {
            int position = (A.length/2);
            double median = 0.5 * ( A[position]);
            System.out.println("Median is " + median);
        }
    }

    public void mode()
    {     
        int freq = 0;
        int tmp =0;
        int mode = 0;
        for( int i = 0; i<A.length-1; i++)
        {
            if (A[i] == A[i+1])
            {
                tmp++;
                i++;
            }            
            if (tmp > freq)
            {
                freq = tmp;
                mode = A[i-1];
            }
            tmp = 0;
        }
        System.out.println("Mode is " + mode);
    }

    public static void main()
    {
        MeanMedianMode ob = new MeanMedianMode();
        ob.input();
        ob.sort();
        ob.mean();
        ob.median();
        ob.mode();        
    }
}