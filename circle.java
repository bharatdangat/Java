//accept value from user &write function to calculate area of circle
import java.util.*;
class circle
{
 float r,a;
 void area(float r)
 {
  a=3.14f*r*r;
  System.out.println("Area Of Circle="+a);
 }
 public static void main(String argc[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Radius-");
  float r=sc.nextFloat();
  circle ob=new circle();
  ob.area(r);
 }
}
