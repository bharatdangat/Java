//CRATE CLASS AREA AND CALCULATE AREA OF CIRCLE,RECTANGLE,SQURE USIN DIFFERENT FUNCTION.......
class area
{
 float a;
  void circle(float r)
  { 
   a=3.14f*r*r;
   System.out.println("Area of circle-"+a);
  }
  void rectangle(float l,float b)
  {
   a=l*b;
   System.out.println("Area of Rectangle-"+a);
  }
  void square(float s)
  {
   a=s*s;
   System.out.println("Area of Square-"+a);
  }
  public static void main(String arg[])
  {
   area ob=new area();
   ob.circle(9.4f);
   ob.rectangle(3.3f,3.4f);
   ob.square(5.5f);
  }
 }

