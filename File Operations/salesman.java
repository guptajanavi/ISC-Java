import java.util.*;
import java.io.*;

class salesman {
  public static void main(String args[]) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bro = new BufferedReader(isr);
    String n;
    int or, i;
    FileReader fr = new FileReader("Salesmen.txt");
    BufferedReader br = new BufferedReader(fr);
    Scanner sc = new Scanner(System.in);
    String name, s;
    int order;
    System.out.println("Name\tOrder");
    do {
      s = br.readLine();
      if (s != null) {
        StringTokenizer st = new StringTokenizer(s, " ");
        name = st.nextToken();
        order = Integer.parseInt(st.nextToken());
        if (order <= 75000)
          continue;
      }
    } while (s != null);
    System.out.println(name + "\t" + order);

    br.close();
  }
}