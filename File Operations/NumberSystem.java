package StringTokenizerDemo;
import java.util.*;
public class NumberSystem
{
    public String decToBin(int n)
    {
        String bin="";
        int r;
        while(n>0)
        {
            r=n%2;
            bin=r+bin;
            n/=2;
        }
        return bin;
    }

    void decToOct(int n)
    {
        String oct="";
        int r;
        while(n>0)
        { 
            r=n%8;
            oct=r+oct;
            n/=8;
        }
        System.out.println("Octal equivalent "+oct);
    }

    void decToHexaDecimal(int n)
    {
        String hex="";
        int r;
        while(n>0)
        {
            r=n%16;
            if ( r<= 9)
            {
                hex=r+hex;
            }
            else
            {
                hex=hex+(char) (r + 55);
            }
            n/=16;
        }
        System.out.println("Hexa decimal equivalent "+hex);
    }
    
    public int binToDec ( int n)
    {
        int j = 1;
        int dec = 0;
        for ( int i =0 ; i<8; i++)
        {
            int ld = n%10;
            dec += ld*j;
            j *= 2;
            n /= 10;
        }
        return dec;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        NumberSystem obj=new NumberSystem();
        int ch,n=0;
        do
        {
            System.out.print("Menu\n1.Decimal to Binary\n2.Decimal to Octal\n3.Decimal to Hexa decimal \n4.Exit\nEnter Choice ");
            ch=sc.nextInt();
            if(ch>=1 && ch<=3)
            {
                System.out.println("Enter a Number ");
                n=sc.nextInt();
            }
            switch(ch)
            {
                case 1:
                obj.decToBin(n);
                break;
                case 2:
                obj.decToOct(n);
                break;
                case 3:
                obj.decToHexaDecimal(n);
                break;
                case 4:
                obj.binToDec(n);
                System.out.println("Thank You");
                break;
                default:
                System.out.println("Invalid");
            }
        }while(ch!=4);
    }
}