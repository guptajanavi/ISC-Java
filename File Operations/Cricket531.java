package FileHandling;
import java.io.*;
class Cricket531
{
    public static void main() throws IOException  
    {
        FileWriter fw=new FileWriter("Cricket.Txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String n;
        int r;
        do
        {
            System.out.println("Enter player name ");
            n=br.readLine();
            System.out.println("Enter Runs ");
            r=Integer.parseInt(br.readLine());
            if ( r>= 3000)
                pw.println(n);
        }while ( r>0);
        pw.close();
    }
}