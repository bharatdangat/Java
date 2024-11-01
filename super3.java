//SUPER-3)calling  base class parametrised constructor.......
class A
{
 A(int a,int b)
 {
   int c=a+b;
   System.out.println("Addition1-"+c);
 }
}
class B extends  A
{
 B(int a,int b)
 { 
 super(a,b);
   int c=a+b;
   System.out.println("Addition2-"+c); 
}
}
class MD
{
 public static void main(String arg[])
 {
  B ob=new B(11,22);
 }
}


