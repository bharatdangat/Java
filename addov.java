//overload add function..
class Demo
{
 void add(int a,int b)
 {
  int c=a+b;
  System.out.println("Addition-"+c);
 }
 //1-BY CHANGING THE ARGUMENT LIST........
 void add(int a,int b,int c)
 {
  int d=a+b+c;
  System.out.println("Addition="+c);
 }
 //2-BY CHANGING ARGUMENT LIST.........
 void add(float a,float b)
 {
 float c=a+b;
 System.out.println("Addition="+c);
 }
 public static void main(String arg[])
 {
  Demo ob=new Demo();
  ob.add(11,22);
  ob.add(11,22,33);
  ob.add(0.4f,0.6f);
 }
}
