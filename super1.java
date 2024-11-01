//SUPER-1)accessing base class mebers.
class A
{
 int x=44;
}
class B extends A
{
 int x=55;
 void disp()
 {
  int x=66;
  System.out.println("value1="+x);
  System.out.println("value2="+this.x);
  System.out.println("value3="+super.x);
 }
}
class Demo
{
 public static void main(String arg[])
 {
  B ob=new B();
  ob.disp();
 }
}
