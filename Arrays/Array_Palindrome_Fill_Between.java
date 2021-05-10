package ArrayDemo;
/*
 * Fill an array A of size 10 by all the palindome numbers between start & End
 */

import java.util.Scanner;
class Array_Palindrome_Fill_Between
{
    int a[]=new int[10];
    int start,end;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a starting & ending numbers ");
        start=sc.nextInt();
        end=sc.nextInt();
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
        int i,j=0;
        for(i=start;i<=end && j<10;i++)
        {
            if(palindrome(i))
            {
                a[j]=i;
                j++;
            }
        }
    }

    void display()
    {
        int i;
        System.out.println("Palindrome Numbers are ");
        for(i=0;i<a.length;i++)
        {
            if(palindrome(a[i]))
            {
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String args[])
    {
        Array_Palindrome_Fill_Between ap=new Array_Palindrome_Fill_Between();
        ap.input();
        ap.fillPalindrome();
        ap.display();
    }
}