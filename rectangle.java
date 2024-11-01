//write program to calculate area and perimeter of rectangle(write separate function)
import java.util.*;
class rectangle
{
 float a,p;
 void area(float r)
 {
  a=3.14f*r*r;
  System.out.println("Area Of Rectangle-"+a);
 }
 void perimeter(float l,float b)
 {
  p=2*(l+b);
  System.out.println("Perimeter of Rectangle-"+p);
 }
 public static void main(String argc[])
 {
  rectangle ob=new rectangle();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Radius");      //ACCEPT R FROM USER
  float r=sc.nextFloat();
  ob.area(r);
  
  System.out.println("Enter Length");      //ACCEPT l FROm USER
  float l=sc.nextFloat();
  System.out.println("Enter Breadth");      //ACCEPT b FROM USER
  float b=sc.nextFloat();
  ob.perimeter(l,b);
 }
}

