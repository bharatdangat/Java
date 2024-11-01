//interface---------
//NOTE-INTERFACE DECLARED METHOD MUST BE PUBLIC in defination////
interface I1
{ 
 void add(int a,int b);
 void square(int n);
}
interface I2
{ 
  void cube(int n);
}

class Demo implements I1,I2
{
  public void add(int a,int b)
  {
   int c=a+b;
   System.out.println("Addition-"+c);
   }
   public void square(int n)
  {
   int c=n*n;
   System.out.println("Square-"+c);
   }
   public void cube(int n)
  {
   int c=n*n*n;
   System.out.println("Cube-"+c);
   }
 }
 class MD
 {
 public static void main(String arg[])
 {
   Demo ob=new Demo();
   ob.add(11,22);
   ob.square(11);
   ob.cube(3);
 }
 }
