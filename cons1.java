//ACCEPT  EMP  INFO AND DISPLAY  USING DEFAULT  CONSTRUCTOR..........
class Emp
{
 int eno;
 String ename;
 float sal;

Emp()  //class name and conc name are always same.........
{
  eno=101;
  ename="om";
  sal=40000;
  System.out.print("Emp No-"+eno);
 System.out.print("Emp Name-"+ename);
 System.out.print("Emp Sal-"+sal);
}
public static void main(String arg[])
{
 Emp ob=new Emp();
}
}
