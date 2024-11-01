//multilevel  inheritance-STUDENT-EXAM-RESULT.....
import java.util.*;
class Student
{
 int rno;
  String sname;
  Scanner sc=new Scanner(System.in);
  void accepts()
  {
     System.out.println("Enter student rno-");
     rno=sc.nextInt();
     System.out.println("Enter student name-");
     sname=sc.next();
  }
}
class Exam extends Student
{
  int  m1,m2,m3,m4,m5,m6;
  Scanner sc=new Scanner(System.in);
  void acceptm()
  {
     System.out.println("Enter six subject marks-");
     m1=sc.nextInt();
      m2=sc.nextInt();
       m3=sc.nextInt();
        m4=sc.nextInt();
         m5=sc.nextInt();
          m6=sc.nextInt();
  }
}
class Result extends Exam
{
 int t;
 float p;
  void cal()
  {
      t=m1+m2+m3+m4+m5+m6;
      p=t/6;
  }

  void disp()
  {
   System.out.println("Student Roll No-"+rno);
   System.out.println("Student Name-"+sname);
   System.out.println("Ttal marks-"+t);
   System.out.println("Per-"+p);
  }
}
class MDemo
{
public static void main(String arg[])
{
  Result ob=new Result();
  ob.accepts();
  ob.acceptm();
  ob.cal();
  ob.disp();
}
}
