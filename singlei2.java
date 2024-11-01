//single inheritance-College-Student
import java.util.*;
class College
{
  int cno;
  String cname;
  String add;
  Scanner sc=new Scanner(System.in);
  void acceptc()
  {
     System.out.println("Enter college no-");
     cno=sc.nextInt();
     System.out.println("Enter college name-");
     cname=sc.next();
     System.out.println("Enter college add-");
     add=sc.next();
  }
}

class Student extends College
{
 int rno;
 String sname;
 float per;
 void accepts()
 { 
  
  System.out.println("Enter Student no-");
     rno=sc.nextInt();
     System.out.println("Enter student name-");
     sname=sc.next();
     System.out.println("Enter per-");
     per=sc.nextFloat();
  }
  void disp()
  {
   System.out.println("College No-"+cno);
   System.out.println("College Name-"+cname);
   System.out.println("College Add-"+add);
   System.out.println("Student No-"+rno);
   System.out.println("Student Name-"+sname);
   System.out.println("Student per"+per);
  }
}
class MDemo
{
public static void main(String arg[])
{
  Student ob=new Student();
  ob.acceptc();
  ob.accepts();
  ob.disp();
}
}
