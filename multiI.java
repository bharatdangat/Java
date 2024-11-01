//multilevel Inheritance
class A
{
  A()     //costructor........
  {
   System.out.println("I am Base Class...");
  }
}
class B extends A
{
  B()     //costructor........
  {
   System.out.println("I am Intermediate Class...");
  }
}
class C extends B
{
  C()
  {
   System.out.println("I am Derived Class...");
   
  }
}
class MDemo
{
public static void main(String arg[])
{
  //we create object of derived class 
 C ob=new C();
}
}


