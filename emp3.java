//this--->1]Assign values from local variable to globlal variable.........
//create class emp(eno,ename,sal)
import java.util.*;
class Emp
{
 int eno;
 String ename;
 float sal;
 void accept(int eno,String ename,float sal)
 {
  this.eno=eno;
  this.ename=ename;
  this.sal=sal;
 }
 void display()
 { 
  System.out.println("Emp No="+eno);
  System.out.println("Emp Name="+ename);
  System.out.println("Emp Sal="+sal);
 }
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Emp No-");
  int eno=sc.nextInt();
  System.out.println("Enter Emp Name-");
  String ename=sc.next();
  System.out.println("Enter Emp Sal-");
  float sal=sc.nextFloat();
  Emp ob=new Emp();
  ob.accept(eno,ename,sal);
  ob.display();
  
 }
}
