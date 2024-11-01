//2]static method
class Demo
{
 static void add(int a,int b)
 {
 int c=a+b;
  System.out.println("Addition="+c);
 }
 public static void main(String arg[])
 {
  add(11,22); //directly calling without class and object
  Demo.add(11,33); //using class name
  Demo ob=new Demo(); //using object name(commonly used)
  ob.add(11,44);
 }
}
