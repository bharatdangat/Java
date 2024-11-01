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
  Demo ob=new Demo();
  ob.show();
  ob.show();
  ob.show();
 }
}
/*o/p->>>>>>>>>>>>>>>
Value of a=1
Value of a=2
Value of a=3
