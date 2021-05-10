package DDArrayDemo;
import java.util.*;
public class findSaddlePoint{
    int A [][] = new int [3][3];
    void fill(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter array elements");
        int i,j;
        for (i = 0; i<3; i++){
            for (j = 0; j<3; j++){
                A[i][j] = sc.nextInt();
            }
        }
    }

    void print(){
        int i,j;
        for (i = 0; i<3; i++){
            for (j = 0; j<3; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    boolean check(int n){
        
        for (int i = 0; i < n; i++)
        {
            int minRow = A[i][0], colInd = 0;
            for (int j = 1; j < n; j++)
            {
                if (minRow > A[i][j])
                {
                    minRow = A[i][j];
                    colInd = j;
                }
            }
            int k;
            for (k = 0; k < n; k++){
                if (minRow < A[k][colInd])
                    break;
            }        
            if (k == n){
                System.out.println("Value of Saddle Point " + minRow);
                return true;
            }
    }
    return false;
}

    public static void main (String [] args){
        findSaddlePoint ob = new findSaddlePoint();
        ob.fill();
        ob.print();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter row to check");
        if (ob.check(sc.nextInt()) == false)
            System.out.println("No Saddle Point ");
    }
}