package ArrayDemo;
/*
 * Fill an array A of size 25 by all the palindome numbers between 1 & N
 */

import java.util.Scanner;
class Array_Palindrome_Fill
{
    int a[]=new int[25];
    int limit;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Limit ");
        limit=sc.nextInt();
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
        for(i=1;i<=limit && j<25;i++)
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
        Array_Palindrome_Fill ap=new Array_Palindrome_Fill();
        ap.input();
        ap.fillPalindrome();
        ap.display();
    }
}
