//checks whether the first letter is a vowel or not
import java.util.*;

public class checkVowel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character");
    char ch = sc.nextLine().charAt(0);
    ch = Character.toUpperCase(ch);
    switch (ch) {
    case 'A':
      System.out.println("It is a vowel");
      break;
    case 'E':
      System.out.println("It is a vowel");
      break;
    case 'I':
      System.out.println("It is a vowel");
      break;
    case 'O':
      System.out.println("It is a vowel");
      break;
    case 'U':
      System.out.println("It is a vowel");
      break;
    default:
      System.out.println("It is not a vowel");
    }
  }
}