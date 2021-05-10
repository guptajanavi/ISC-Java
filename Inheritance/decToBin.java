package InheritanceDemo;
class decToBin extends numberDemo{
    void convert(int n){
        String bin="";
        int r;
        while(n>0)
        {
            r=n%2;
            bin=r+bin;
            n/=2;
        }
        System.out.println("Binary equivalent "+bin);
    }
}