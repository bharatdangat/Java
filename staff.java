import java.util.*;
abstract class Staff
{
 Scanner sc=new Scanner(System.in);
 abstract void accept();
 abstract void disp();
}
class Fulltime extends Staff
{
Fulltime(string name,String add,String dept,int sal)
{
System.out.println("Enter member name");
 String name=sc.next();
 System.out.println("Enter member address");
 String add=sc.next();
 System.out.println("Enter member dept ");
 String name=sc.next();
 System.out.println("Enter member salaty");
 int sal=sc.nextInt();
  
    System.out.println("member name="+name);
     System.out.println("member address="+add);
      System.out.println("member dept="+dept);
       System.out.println("member salary="+sal);
  
}
}

class Parttime extends Staff
{
Parttime(string name,String add,int hour,int rate)
{
  
     System.out.println("Enter member name");
 String name=sc.next();
 System.out.println("Enter member address");
 String add=sc.next();
 System.out.println("Enter member no of hours ");
 String hour=sc.nextInt();
 System.out.println("Enter member rate");
 int rate=sc.nextInt();

  
    System.out.println("member name="+name);
     System.out.println("member address="+add);
      System.out.println("member no of hours="+hour);
       System.out.println("member rate="+rate);
  
}
}

class MD
{
public static void main(String arg[])
{
  Parttime ob=new Parttime(name,add,dept,sal);
  
  Fulltime ob=new Fulltime(name,add,hour,rate);
  
  }
}

