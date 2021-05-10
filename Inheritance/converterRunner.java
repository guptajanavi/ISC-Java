package InheritanceDemo;
import java.util.*;
public class converterRunner{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your option- temp, money, length");
        int ch = sc.nextInt();
        System.out.println("Enter value to convert");
        double n = sc.nextDouble();
        converter obj;
        switch(ch){
            case 1: obj = new temp (); obj.calculate(n); break;
            case 2: obj = new money (); obj.calculate(n); break;
            case 3: obj = new length (); obj.calculate(n); break;
            default: System.out.println("Wrong choice");
        }
    }
}