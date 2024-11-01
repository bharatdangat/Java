//accept n emp info in main function and pass to the accept function and display.......
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
System.out.println("Emp No-"+eno);
System.out.println("Emp Name-"+ename);
System.out.println("Emp Sal-"+sal);
}
public static void main(String arg[])
{
 Emp ob[]=new Emp[10];//create array of object.......
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Limit-");
 int n=sc.nextInt();
 for(int i=0;i<n;i++)
 {
 ob[i]=new Emp();  //allocate the memory.........
 System.out.println("Enter Emp No-");
 int eno=sc.nextInt();
 System.out.println("Enter Emp Name-");
 String ename=sc.next();
 System.out.println("Enter Emp Sal-");
 float sal=sc.nextFloat();
 ob[i].accept(eno,ename,sal);
 }
 for(int i=0;i<n;i++)
 {
  ob[i].display();
 }
 }
}
