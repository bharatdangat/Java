//multilevel  inheritance-GRANDFATHER-FATHER-CHILD.....
import java.util.*;
class Grandfather
{
  String gname;
  Scanner sc=new Scanner(System.in);
  void acceptg()
  {
     System.out.println("Enter grandfather name-");
     gname=sc.next();
  }
}
class Father extends Grandfather
{
  String fname;
  Scanner sc=new Scanner(System.in);
  void acceptf()
  {
     System.out.println("Enter father name-");
     fname=sc.next();
  }
}
class Child extends Father
{
  String cname;
  Scanner sc=new Scanner(System.in);
  void acceptc()
  {
     System.out.println("Enter child name-");
     cname=sc.next();
  }

  void disp()
  {
   System.out.println("Grandfather Name-"+gname);
   System.out.println("Father Name-"+fname);
   System.out.println("Children Name-"+cname);
  }
}
class MDemo
{
public static void main(String arg[])
{
  Child ob=new Child();
  ob.acceptg();
  ob.acceptf();
  ob.acceptc();
  ob.disp();
}
}
