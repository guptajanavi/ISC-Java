package InheritanceDemo;
import java.util.*;
class driverNumberDemo{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        int n;
        numberDemo nd; 
        do{
            System.out.println("Menu\n1.Binary\n2.Octal\n3.Hexadecimal\n4.Exit");
            ch=sc.nextInt();            
            System.out.println("Enter the Value ");
            n=sc.nextInt();
            switch(ch)
            {
                case 1:
                nd = new decToBin();
                nd.convert(n);
                break;
                case 2:
                nd=new decToOctal();
                nd.convert(n);
                break;
                case 3:
                nd = new decToHexaDec();
                nd.convert(n);
                case 4:
                System.out.println("Thank you");
                break;
                default:
                System.out.println("Invalid Choice");
            }
        }while (ch != 4);
    }
}