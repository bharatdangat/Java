//create class emp and acceot emp info and display......
import java.util.*;
class Emp
{
 int eno;
 String ename;
 float sal;
 void accept()
 {
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter Emp No-");
  eno=sc.nextInt();
  System.out.println("Enter Emp Name-");
   ename=sc.next();
  System.out.println("Enter Emp Sal-");
    sal=sc.nextFloat();
  
}
 void disp()
 { 
  System.out.println("Emp No-"+eno);
  System.out.println("Emp Name-"+ename);
  System.out.println("Emp Sal-"+sal);
 }
 public static void main(String arg[])
 {
  Emp ob=new Emp();
  ob.accept();
  ob.disp();
 }
}
