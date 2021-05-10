package InheritanceDemo;
import java.util.*;
public class Interface{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want a square or rectangle?");
        int ch = sc.nextInt();
        if(ch==1)
        {
            int side = sc.nextInt();
            Square a = new Square(side);
            a.printArea();a.printPeri();
        }
        if(ch==2)
        {
            System.out.println("Enter length and breadth");
            int len = sc.nextInt();
            int bre = sc.nextInt();
            Rectangle r= new Rectangle(len, bre);
            r.printArea();r.printPeri();
        }
    }
}