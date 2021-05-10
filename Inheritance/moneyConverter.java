package InheritanceDemo;
import java.util.*;
class moneyConverter implements convert{
    public void convert(double n){
        double sum = n/103;
        System.out.println(n + " in pounds is " + sum);
    }    

    public void convert (float n){
        double sum = n/90;
        System.out.println(n + " in euros is " + sum);
    }

    public void convert (int n){
        double sum = n/75;
        System.out.println(n + " in dollars is " + sum);
    }

    public static void main (String [] args){        
        Scanner sc = new Scanner (System.in);
        moneyConverter ob = new moneyConverter();
        int ch = 0;
        do {
            System.out.println("Menu:\n1. Pound\n2. Euro\n3. Dollar\n4. Exit");
            ch = sc.nextInt();
            switch (ch){
                case 1: System.out.println("Enter the sum of money");
                double n = sc.nextDouble();
                ob.convert(n);
                break;
                case 2: System.out.println("Enter the sum of money");
                float x = sc.nextFloat();
                ob.convert(x);
                break;
                case 3: System.out.println("Enter the sum of money");
                int y = sc.nextInt();
                ob.convert(y);
                break;
                case 4: System.out.println("Thank you");
                break;
                default: System.out.println("Invalid"); 
            }
        }while (ch!=4);
    }
}
