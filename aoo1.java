//accept n employee info and display use array of object
import java.util.*;
class Emp
{
 int eno;
 String ename;
 float sal;
}
void accept()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Emp No-");
 eno=nextInt();
 System.out.println("Enter Emp Name-");
 ename=next();
 System.out.println("Enter Emp Sal-");
 sal=nextFloat();
}
void display()
{
 System.out.println("Emp No-"+eno);
 System.out.println("Emp Name-"+ename);
  System.out.println("Emp Sal-"+sal);
}
public static void main(String arg[])
{
 Emp ob[]=new Emp[10]; //create object......(aoo)
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Limit-");
 int n=sc.nextInt();
 for(int i=0;i<n;i++)
 {
  ob[i]=new Emp(); //alocate memory...............
  ob[i].accept();   //call accept function
 }
 for(int i=0;i<n;i++)
 {
  ob[i].display();
 }
}
