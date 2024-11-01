//Accept emp info and display using throws
import java.io.*;
class Emp
{
  public static void main(String arg[])throws Exception
{
 DataInputStream din=new DataInputStream(System.in);
 System.out.println("Enter Emp no");
 int eno=Integer.parseInt(din.readLine());
 System.out.println("Enter Emp name");
 String ename=din.readLine();
 System.out.println("Enter Emp no");
 String s=din.readLine();
 float sal= Float.parseFloat(s);

System.out.println("Emp no="+eno);
System.out.println("Emp name="+ename);
System.out.println("Emp sal="+sal);
}

}
