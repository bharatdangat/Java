//Define class Cricket_player create array of n objects calculate batting avarage for each player using static method avg().
//Display the details of player having maximum avarage..

import java.util.*;
class Cricket_Player
{
 String name;
 int noi,notno,tr;
 float bat_avg;
 
 void accept()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Player name-");
   name=sc.next();
   System.out.println("Enter numbeer of innings-");
   noi=sc.nextInt();
   System.out.println("Enter number of times not out-");
   notno=sc.nextInt();
   System.out.println("Enter total runs-");
   tr=sc.nextInt();
   bat_avg=tr/(noi-notno);
  }

 void display()
 {
  System.out.println("Name="+name);
  System.out.println("Number of innings="+noi);
System.out.println("Number of times not out="+notno);
System.out.println("Total Runs="+tr);
System.out.println("Bat Avg-"+bat_avg);
 }
public static void main(String arg[])
{
  Cricket_Player ob[]=new Cricket_Player[100]; //create array of object
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Limit-");
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
  {
    ob[i]=new Cricket_Player();  //Allocate memory......
    ob[i].accept();     //function calling........
  }
    float max=ob[0].bat_avg;
    int index=0;
    for(int i=0;i<n;i++)
    {
       if(ob[i].bat_avg>max)
       {
       max=ob[i].bat_avg;
       index=i;   //i chi value index madhe store keli..........
    }
    }
    ob[index].display();
}
}


