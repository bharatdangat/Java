//multilevel  inheritance-College-Student
import java.util.*;
class Content
{
  String contname;
  Scanner sc=new Scanner(System.in);
  void acceptc()
  {
     System.out.println("Enter content name-");
     contname=sc.next();
  }
}
class Country extends Content
{
  String coutname;
  Scanner sc=new Scanner(System.in);
  void acceptcc()
  {
     System.out.println("Enter country name-");
     coutname=sc.next();
  }
}
class State extends Country
{
  String sname;
  Scanner sc=new Scanner(System.in);
  void acceptccc()
  {
     System.out.println("Enter state name-");
     sname=sc.next();
  }

  void disp()
  {
   System.out.println("Content No-"+contname);
   System.out.println("Country Name-"+coutname);
   System.out.println("State Name-"+sname);
  }
}
class MDemo
{
public static void main(String arg[])
{
  State ob=new State();
  ob.acceptc();
  ob.acceptcc();
  ob.acceptccc();
  ob.disp();
}
}
