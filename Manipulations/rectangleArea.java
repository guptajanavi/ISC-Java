//write a program to find the area of a rectangle using constructers and functions
import java.util.*;

public class rectangleArea {
  double l, b, area;
  Scanner sc = new Scanner(System.in);

  public rectangleArea() {
    l = 0.0;
    b = 0.0;
    area = 0.0;
  }

  public rectangleArea(double l, double b, double area) {
    this.l = l;
    this.b = b;
    this.area = area;
  }

  public void display() {
    System.out.println("Area is: " + area);
  }

  public void calcArea() {
    area = l * b;
  }

  public void input() {
    System.out.println("Enter length and breadth");
    l = sc.nextDouble();
    b = sc.nextDouble();
  }

  public static void main(String[] args) {
    rectangleArea obj = new rectangleArea();
    obj.input();
    obj.calcArea();
    obj.display();
  }
}