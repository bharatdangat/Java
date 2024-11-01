//ACCEPT  EMP  INFO AND DISPLAY  USING PARAMETRISED   CONSTRUCTOR..........
class Emp
{
 int eno;
 String ename;
 float sal;

Emp(int eno,String ename,float sal)
{
 this.eno=eno;
 this.ename=ename;
 this.sal=sal;
 }
 void display()
 {
  System.out.println("Emp No-"+eno);
 System.out.println("Emp Name-"+ename);
 System.out.println("Emp Sal-"+sal);
}
public static void main(String arg[])
{
  Emp ob=new Emp(101,"om",2000);
  ob.display();
}
}
