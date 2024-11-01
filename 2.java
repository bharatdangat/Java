//Accept n student info and display descending order of name of stuedent
//======we use concept of array ob object
import java.util.*;
class Student
{
 int rno;
 String sname;
 float per;
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Roll No-");
  rno=sc.nextInt();
  System.out.println("Enter Name-");
  sname=sc.next();
  System.out.println("Enter Per-");
  per=sc.nextFloat();
 }
 //only for practice we use static meethod....
 static void sort(Student ob[],int n)
 {
   //we use bubble sort
   int i,pass;
   for(pass=1;pass<n;pass++)
   {
    for(i=0;i<n-pass;i++)
    {
   int   k=ob[i].sname.ComareTo(ob[i+1].sname);
     if(k>0)
     {
         Student t=ob[i];
         ob[i]=ob[i+1];
         ob[i+1]=t;
     }
    }
   }
    for( i=0;i<n;i++)
    {
      System.out.println(ob[i].rno+"\t"+ob[i].sname+"\t"+ob[i].per);
    }
   }
 public static void  main(String arg[])
 {
  Student ob[]=new Student[100]; //create aoo
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Limit-");
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
  {
    ob[i]=new Student(); //Alocate memory......
    ob[i].accept();
  }
 sort(ob,n);    //we use static method.....
 }
 }
 
