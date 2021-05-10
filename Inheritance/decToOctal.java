package InheritanceDemo;
class decToOctal extends numberDemo{
    void convert(int n)
    {
        String oct="";
        int r;
        while(n>0)
        { 
            r=n%8;
            oct=r+oct;
            n/=8;
        }
        System.out.println("Octal equivalent "+oct);
    }    
}