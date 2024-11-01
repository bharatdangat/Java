//create class student calculate total and per and diaplay result........
import java.util.*;
class Student
{
 int rno,m1,m2,m3,m4,m5,m6,t;
 String sname;
 float p;
 void accept()
 {
 //imp note-NOT DECLARE DATATYPE AGAIN IN ACCEPT FUNCTION.......
 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Roll No-");
   rno=sc.nextInt();
  System.out.println("Enter Name-");
  sname=sc.next();
  
  System.out.println("Enter Six Sub marks-");
   m1=sc.nextInt();
   m2=sc.nextInt();
   m3=sc.nextInt();
   m4=sc.nextInt();
   m5=sc.nextInt();
   m6=sc.nextInt();
 
 }
 void cal()
 {
    t=m1+m2+m3+m4+m5+m6;
    p=(t/6);
 }
 void display()
 {
  System.out.println("Student Roll No-"+rno);
  System.out.println("Student Name-"+sname);
  System.out.println("Student Per-"+p);
  System.out.println("Student marks Total-"+t);
 }
 public static void main(String arg[])
 {
  Student ob=new Student();
  ob.accept();
  ob.cal();
  ob.display();
 }
}
