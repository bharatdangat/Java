//write java program to calculate area of circle,traingle&rectangle (use method overloading....)
class Demo
{
 void area(float r)
 {
  float a=3.14f*r*r;
  System.out.println("Area of circle-"+a);
 }
 void area(float b,float h)
 {
  float a=0.5f*b*h;
  System.out.println("Area of trainangle-"+a);
 }
 void area(double l,double b)
 {
  double a=l*b;
  System.out.println("Area of rectangle-"+a);
 }
 public static void main(String arg[])
 {
  Demo ob=new Demo();
  ob.area(12);
  ob.area(0.4f,0.9f);
  ob.area(8.3f);
 }
}
