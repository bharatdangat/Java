//create class emp and acceot emp info and display......
//NOTE -WE ALSO USE THIS
import java.util.*;
class Emp
{
 int eno;
 String ename;
 float sal;
 void accept(int eno1,String ename1,float sal1)
 {
  //assign values of local variable to the global variables...
  eno=eno1;
  ename=ename1;
  sal=sal1;
 }
 void disp()
 { 
  System.out.println("Emp No-"+eno);
  System.out.println("Emp Name-"+ename);
  System.out.println("Emp Sal-"+sal);
 }
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  Emp ob=new Emp();
  System.out.println("Enter Emp No-");
  int no=sc.nextInt();
  System.out.println("Enter Emp Name-");
  String name=sc.next();
  System.out.println("Enter Emp Sal-");
  float s=sc.nextFloat();
  ob.accept(no,name,s);
  ob.disp();
 }
}
