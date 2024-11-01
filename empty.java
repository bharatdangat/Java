//create class student calculate total and per and diaplay result........
import java.util.*;
class Student
{
 int rno;
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Roll No-");
  int no=sc.nextInt(); 
 }
 void display()
 {
  System.out.println("Student Roll No-"+rno);
  }
 public static void main(String arg[])
 {
  Student ob=new Student();
  ob.accept();
  ob.display();
 }
}
