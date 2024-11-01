//SUPER-2)calling  base class methods.......
class A
{
 void add(int a,int b)
 {
   int c=a+b;
   System.out.println("Addition1-"+c);
 }
}
class B extends  A
{
 void add(int a,int b)
 {
  super.add(22,33); //called base class method 
   int c=a+b;
   System.out.println("Addition2-"+c); 
}
}
class MD
{
 public static void main(String arg[])
 {
  B ob=new B();
  ob.add(11,22);
 }
}


