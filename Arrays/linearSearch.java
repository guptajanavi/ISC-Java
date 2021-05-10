import java.util.*;
class linearSearch{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a [] = new int [5];
        int i,n,c=0;
        System.out.println("Enter array values");
        for (i = 0; i<a.length; i++){
          a[i] = sc.nextInt();
        }
        System.out.println("Enter a number to Search ");
        n=sc.nextInt();
        for(i=0;i<a.length;i++)   
        {                                     
            if(a[i]==n)
            {
                c++;
            }
        }
        System.out.println("Number "+n+" found "+c+" times ");
    }
}


