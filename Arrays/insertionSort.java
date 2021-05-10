import java.util.*;
class insertionSort{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i,j,t;
        System.out.println("Enter 5 numbers ");
        for(i=0;i<a.length;i++){                                          a[i]=sc.nextInt();                              
        }
        for(i=1;i<a.length;i++)
        {
            t=a[i];
            for(j=i-1;j>=0 && a[j]>t;j--)
            {
                a[j+1]=a[j];
            }
            a[j+1]=t;
        }
        System.out.println("in Ascending Order ");
        for(i=0;i<a.length;i++){                                          System.out.println(a[i]);
        }
    }
}