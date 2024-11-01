//create class employee Define default and parametrised constructor use 'this ' keyword to initilize instance variable keeep count of object created create object using parametrised constructor and display object count after each object is created 
//(use static  member and method )
class Employee
{
 static int cnt=0;
 int eno;
 String ename,dept;
 float sal;
 Employee()
 {
   cnt++;
   eno=101;
   ename="om";
   dept="computer";
   sal=3000;
 }
 Employee(int eno,String ename,String dept,float sal)
 {
   cnt++;
   this.eno=eno;
   this.ename=ename;
   this.dept=dept;
   this.sal=sal;
 }
 void disp()
 {
  System.out.println("Object Count-"+cnt);
  System.out.println("Emp no="+eno);
    System.out.println("Emp name="+ename);
System.out.println("Emp Dept="+dept);
System.out.println("Emp Salary="+sal);

 }
 public static void main(String arg[])
 {
  Employee ob=new Employee();
  ob.disp();          //call to default coc.and display
  
  Employee ob1=new Employee(102,"sai","science ",9000);
  ob1.disp();
 }
}
