

package StringDemo;
import java.util.*;
public class formString{
    String sent;
    int len;
    public formString(){
        sent = "";
        len = 0;
    }

    public formString(String s, int len){
        this.sent = sent;
        this.len = len;
    }

    void getString(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence");
        sent = sc.nextLine();
    }

    int lenString(){
        len = sent.length();
        return len;
    }

    char charatpos(int k){
        return sent.charAt(k);
    }

    void printchar(char cx){
        System.out.print(cx);
    }

    void printNewLine(){
        System.out.println();
    }

    boolean ifuppercase(char cc){
        return Character.isUpperCase(cc);
    }

    boolean ifEndOfSentence(int j){
        char ch = charatpos(j);
        char ch1 = charatpos(j+1);
        char ch2 = charatpos(j+2);
        if (ch == '.' && ifuppercase(ch2) == true && ch1 == ' ')
            return true;
        return false;
    }

    void printSent(){
        for (int i = 0; i<len; i++){
            char ch = sent.charAt(i);
            if (i < len-2){
                if (ifEndOfSentence(i)){
                    printchar(ch);
                    printNewLine();
                }
                else
                    printchar(ch);
            }
            else
                printchar (ch);
        }
    }

    public static void main(){
        formString ob = new formString();
        ob.getString();
        ob.lenString();
        ob.printSent();
    }
}

