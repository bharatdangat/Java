//this--->1]Acess or print Global members.....

class Demo
{
 int a=10;    //GLOBAL VARIABLE.......
 void show()
 {
   int a=20;  //LOCAL VARIABLE....
  System.out.println("Value--"+this.a);
  System.out.println("Value--"+a);
  this.a=99;
  System.out.println("Value--"+this.a);
 }
 public static void main(String arg[])
 {
  Demo ob=new Demo();
  ob.show();
 }
}
