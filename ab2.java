import java.util.*;
abstract class Shape
{
Scanner sc=new Scanner(System.in);
  abstract void area();
}
class Rectangle extends Shape
{
  void area()
  {
    System.out.println("Enter length and breadth-");
    int l=sc.nextInt();
    int b=sc.nextInt();
   int  a=l*b;
    System.out.println("Area of  Rectangke-"+a);
  }
}
class Triangle extends Shape
{
  void area()
  {
    System.out.println("Enter Base and height-");
    int b=sc.nextInt();
    int h=sc.nextInt();
    float a=0.5f*b*h;
    System.out.println("Area of  Triangke-"+a);
  }
}

class MD
{
 public static void main(String arg[])
 {
   Rectangle ob=new Rectangle();
   ob.area();
   Triangle ob1=new Triangle();
   ob1.area();

 }
}
