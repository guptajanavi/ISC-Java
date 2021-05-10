package ArrayDemo;
import java.util.*;
public class arrayIndexException{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int A [] = new int [5];
        int n = 0;
        System.out.println("Enter array elements");
        for (int i = 0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter position to get its value");
        try{
            n = sc.nextInt();
            System.out.println("Value at position is "+ A[n]);
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("Position entered does not exist in array");
        }
        catch(InputMismatchException im){
            System.out.println("Please enter a number");
        }
    }
}