//# toString Method
class Emp
{
 int eno=11;
 String ename="om";
 int sal=10000;
  
  public String toString()
  {
   return "Emp no="+eno+"\nName="+ename+ "\nsal="+sal;
  }
}
class MD
{
 public static void main(String arg[])
 {
  Emp ob=new Emp();
  System.out.println(ob);
 }
}
