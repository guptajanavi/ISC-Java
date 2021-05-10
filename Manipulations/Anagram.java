package StringDemo;
import java.util.*;
class Anagram
{
    char a[];
    char b[];
    void storeLettersInArray(char arr[],String w)
    {
        int i;
        for(i=0;i<w.length();i++)
        {
            arr[i]=w.charAt(i);
        }
    }

    void displayArray(char arr[])
    {
        System.out.println(arr);
    }

    void bubbleSort(char arr[])
    {
        int i,j;
        char t;
        for(i=arr.length-1;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }

    void checkAnagram()
    {
        Scanner sc = new Scanner(System.in);
        String w1,w2;
        System.out.println("Enter two words ");
        w1=sc.next();
        w2=sc.next();
        if(w1.length()!=w2.length())
            System.out.println("Words are not anagram");
        else
        {
            a=new char[w1.length()];
            b=new char[w2.length()];
            storeLettersInArray(a,w1);
            storeLettersInArray(b,w2);
            displayArray(a);
            displayArray(b);
            //bubbleSort(a);
            //bubbleSort(b);
            //displayArray(a);
            //displayArray(b);
            if(checkAnagram(a,b)==true)
                System.out.println("Words are anagram");
            else
                System.out.println("Words are not anagram");
        }
    }

    boolean checkAnagram(char a[],char b[])
    {
        int i;
        for ( i = 0; i<a.length; i++)
        {
            if ( a[i] != b[i])
            {
                return false;
            }            
        }
        return true;           
    }

    public static void main()
    {
        Anagram obj=new Anagram();
        obj.checkAnagram();
    }
}

