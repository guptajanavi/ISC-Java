import java.util.Scanner;
class bubbleSort{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i,j,t;
        System.out.println("Enter 5 numbers ");
        for(i=0;i<a.length;i++){                                          a[i]=sc.nextInt();                              
        }
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("in Ascending order: ");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
