package ArrayDemo;
/*
 * Fill an array A of size 10 by palindome numbers only
 */

import java.util.Scanner;
class Fill_Palindrome
{
    int a[]=new int[10];
    int input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
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
        int i;
        for(i=0;i<=9;)
        {
            int n=input();
            if(palindrome(n))
            {
                a[i]=n;
                i++;
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
        Fill_Palindrome ap=new Fill_Palindrome();
        ap.input();
        ap.fillPalindrome();
        ap.display();
    }
}