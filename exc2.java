class Demo
{
 public static void main(String arg[])
 {
  try
  {
    int a[]=new int[-5];
     a[0]=10;
    System.out.println("value disp="+a[0]);
  }
  catch(Exception e)
  {
   System.out.println("Error ali display keli-"+e);
  }
 }
}
