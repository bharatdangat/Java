//METHOD OVRRIDING-base class method hide only call derived class method
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
   int c=a+b;
   System.out.println("Addition2-"+c); //hide base class method.........
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


//O-p==Addition2-33


