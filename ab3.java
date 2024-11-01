abstract  class Shape
{
 abstract void cal_area(int r);
 abstract void cal_volume(int r,int h);
}
class Sphere extends Shape
{
  public void cal_area(int r)
  {
    float a=4*3.14f*r*r;
    System.out.println("Area Of sphere-"+a);
  }
  public void cal_volume(int r)
  {
   float v=(4/3)*3.14f*r*r*r;
   System.out.println("Volume  of sphere-"+v);
  }
}
class Cone extends Shape
{
  public void cal_area(int r,int h)
  {
    float a=3.14f*r*(r+h);
    System.out.println("Area Of Cone-"+a);
  }
  public void cal_volume(int r,int h)
  {
   float v=(1/3)*3.14f*r*r*h;
   System.out.println("volume of cone-"+v);
  }
}

class MD
{
 public static void man(String arg[])
 {
   Sphere ob=new Sphere();
   ob.cal_area(12);
   ob.cal_volume(32,13);
 
  Cone ob=new Cone();
   ob.cal_area(11);
   ob.cal_volume(22,23);

 }
}
