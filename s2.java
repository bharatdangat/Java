class Demo
{
 int a=0;
 void show()
 {
  a++;
  
  System.out.println("Value of a="+a);
 }
 public static void main(String arg[])
 {
  Demo ob1=new Demo();
  ob1.show();
  Demo ob2=new Demo();
  ob2.show();
  Demo ob3=new Demo();
  ob3.show();
 }
}
/*o/p->>>>
Value of a=1
Value of a=1
Value of a=1
