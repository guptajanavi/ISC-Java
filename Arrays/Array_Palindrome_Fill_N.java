package ArrayDemo;
/*
 * Fill an array A of size N by all the palindome numbers
 */

import java.util.Scanner;
class Array_Palindrome_Fill_N
{
    int a[];
    int size;
    void inputsize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements of array ");
        size = sc.nextInt();
        a = new int [size];
    }

    int inputNumbers()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element");
        return sc.nextInt();        
    }

    int reverse(int n)
    {
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }

    boolean palindrome(int n)
    {
        return n==reverse(n);
    }

    void fillPalindrome()
    {
        int j=0, i = 0;
        while ( j < size)
        {
            i = inputNumbers();
            if(palindrome(i))
            {
                a[j]= i;
                j++;
                System.out.println("Enter next number");
            }
            else
            {
                System.out.println("Sorry, not palindrome, enter another number");
            }
        }
    }

    void display()
    {
        int i;
        System.out.println("Palindrome Numbers are ");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String args[])
    {
        Array_Palindrome_Fill_N ap=new Array_Palindrome_Fill_N();
        ap.inputsize();
        ap.fillPalindrome();
        ap.display();
    }
}
