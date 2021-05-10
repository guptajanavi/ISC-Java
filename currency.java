import java.util.*;
import java.io.*;

class currency {
  public static void main(String args[]) throws IOException {
    FileReader fr = new FileReader("currency.txt");
    BufferedReader br = new BufferedReader(fr);
    Scanner sc = new Scanner(System.in);
    String cur, s;
    double conv;
    System.out.println("Enter currency and rupee value");
    String search = sc.nextLine();
    int rupees = sc.nextInt();
    do {
      s = br.readLine();
      if (s != null) {
        StringTokenizer st = new StringTokenizer(s, "~");
        cur = st.nextToken();
        conv = Double.parseDouble(st.nextToken());
        if (cur.equals(search) == false)
          continue;
        System.out.println("The " + search + "value is " + rupees * conv);
      }
    } while (s != null);
    br.close();
  }
}
// dollar~70 euro~100 yen~0.71