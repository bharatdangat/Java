//creete class cricket player and calculate bat avg and dispaly......
import java.util.*;
class CricketPlayer
{
 String name;
 int noi,ntno,t,bat_avg;
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Name-");
  name=sc.next();
  System.out.println("Enter Number of Innings-");
  noi=sc.nextInt();
  System.out.println("Enter Number of times ont out-");
  ntno=sc.nextInt();
  System.out.println("Enter Total Runs--");
  t=sc.nextInt();
 }
 void calculate()
 {
   bat_avg=t/ntno;
 }
 void display()
 {
  System.out.println("Bat Avarage-"+bat_avg);
 }
 public static void main(String arg[])
 {
  CricketPlayer ob=new CricketPlayer();
  ob.accept();
  ob.calculate();
  ob.display();
 }
}
