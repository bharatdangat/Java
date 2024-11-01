//Herarchical Inheritance-College-Student-Teacher
import java.util.*;
class College
{
  int cno;
  String cname;
  String add;
  Scanner sc=new Scanner(System.in);
  void acceptc()
 {
     System.out.println("Enter College No");
     cno=sc.nextInt();
     System.out.println("Enter College Name");
     cname=sc.next();
     System.out.println("Enter College Add");
     add=sc.next();
  }
  void dispc()
  {
    System.out.println("College No-"+cno);
    System.out.println("College Name-"+cname);
    System.out.println("College Add-"+add);
  }
}
class Student extends College
{
  int rno;
  String sname;
  float per;
  Scanner sc=new Scanner(System.in);
  void accept()
  {
     System.out.println("Enter Student RNo");
    rno=sc.nextInt();
     System.out.println("Enter  Name");
     sname=sc.next();
     System.out.println("Enter Per");
     per=sc.nextFloat();
  }
  void disp()
  {
    System.out.println("Student RNo-"+rno);
    System.out.println("Student Name-"+sname);
    System.out.println("Student Per-"+per);
  }
  }
class Teacher extends College
{
  int tno;
  String tname;
  float sal;
  Scanner sc=new Scanner(System.in);
  void accept()
  {
     System.out.println("Enter Teacher No");
    tno=sc.nextInt();
     System.out.println("Enter  Name");
     tname=sc.next();
     System.out.println("Enter Sal");
     sal=sc.nextFloat();
  }
  void disp()
  {
    System.out.println("Teacher No-"+tno);
    System.out.println("Teacher Name-"+tname);
    System.out.println("Teacher Sal-"+sal);
  }
}
class MDemo
{
  public static void main(String arg[])
  {
   Student ob=new Student();
   ob.acceptc();
   ob.accept();
   ob.disp();
   Teacher ob1=new Teacher();
   ob1.acceptc();
   ob1.accept();
   ob1.disp();
  }
}

