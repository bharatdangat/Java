package TY;
public class Area
{
 float a;
  public void circle(float r)
  { 
   a=3.14f*r*r;
   System.out.println("Area of circle-"+a);
  }
  public void rectangle(float l,float b)
  {
   a=l*b;
   System.out.println("Area of Rectangle-"+a);
  }
  public void square(float s)
  {
   a=s*s;
   System.out.println("Area of Square-"+a);
  }
 }

