//write java program to accept details of n books and display quantity of given book i.e search book name and display qty
import java.util.*;
class Boock
{
 int bno,qty;
 String bname;
 void accept()
  {
  Scanner sc=new Scanner(System.in); //GLOBALLY 
  System.out.println("Enter Book No-");
  bno=sc.nextInt();
  System.out.println("Enter Book Name-");
  bname=sc.next();
  System.out.println("Enter Book Qty-");
  qty=sc.nextInt();
 }
  public static void main(String arg[])
  {
   int flag=0;
   Boock ob[]=new Boock[100];  //create aoo
   Scanner sc=new Scanner(System.in); //GLOBALLY 
   System.out.println("Enter Limit-");
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
    ob[i]=new Boock(); //Alocate Memory
    ob[i].accept();    //calling function
   }
   System.out.println("Enter Book Name to search-");
   String name=sc.next();
   for(int i=0;i<n;i++)
   {
   if(ob[i].bname.equals(name))
   {
    System.out.println("Quantity of Book-"+ob[i].qty);
    flag=1;
   }
   }
   if(flag==0)
   {
    System.out.println("Book is not found............");
   }
  } 
  }
