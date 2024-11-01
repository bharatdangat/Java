//Define interface shape with .(abstract method area()). write java program to calculate area of circle and sphere(use final keyword)

//NOTE-METHODS DECLAED IN INTERFACE BY DEFAULT ABSTRACT........

interface Shape
{
 final float PI=3.14f;
 void circle(float r);
 void sphere(float r);
}
class Area implements Shape
{
  public void circle(float r)
  {
  float a=PI*r*r;
   System.out.println("Area of circle-"+a);
  }
  public void sphere(float r)
  {
   float a=4*PI*r*r;
   System.out.println("Area of sphere-"+a);
  }
}
class MD
{
 public static void main(String arg[])
 {
  Area ob=new Area();
  ob.circle(5.5f);
  ob.sphere(9.8f);
 }
}
