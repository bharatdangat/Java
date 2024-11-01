class A
{
 final void add(int a,int b)
 {
  int c=a+b;
  System.out.println("Addition="+c);
 }
}
class B extends A
{
  void add(int a,int b)
 {
  int c=a+b;
  System.out.println("Addition2="+c);
 }
}
class MD
{
 public static void main(String arg[])
 {
  B ob=new B();
  b.add(11,22);
 }
}
