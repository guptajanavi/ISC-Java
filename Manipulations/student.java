import java.util.*;

public class student {
  int rollNo, std;
  String name;
  char section;
  float marks[] = new float[5];

  public void input() {
    System.out.println("Enter name, rollno, class, section");
    Scanner sc = new Scanner(System.in);
    name = sc.next();
    rollNo = sc.nextInt();
    std = sc.nextInt();
    section = sc.next().charAt(0);
    System.out.println("Enter marks");
    for (int i = 0; i < marks.length; i++) {
      marks[i] = sc.nextFloat();
    }
  }

  float total() {
    int sum = 0;
    for (int i = 0; i < marks.length; i++) {
      sum += marks[i];
    }
    return sum;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Roll no: " + rollNo);
    System.out.println("Class: " + std);
    System.out.println("Section: " + section);
    System.out.println("Total marks: " + total());
  }

  public static void main(String[] args) {
    student ob = new student();
    ob.input();
    ob.display();
  }
}