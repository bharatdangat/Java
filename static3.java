//3]static block
class Demo
{
 static int a; //vvvvvimp
 void show()
 {
  System.out.println("I am show..");
 }
 static 
 {
  System.out.println("i am static block...");
  a=33;
  System.out.println("value-"+a);
 }
 public static void main(String arg[])
 {
  System.out.println("I am Main.........");
  Demo ob=new Demo();
  ob.show();
 }
}
