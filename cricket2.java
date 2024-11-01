//Define class Cricket_player create array of n objects calculate batting avarage for each player using static method avg().
//Define static sort method which  sort the array n the basis of avarage display the player details in sorted order............
//NOTE--------------------static write in small letter.........
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
   bat_avg=avg(tr,notno,noi);//call avg function for bat avg
  //System.out.println("-"+bat_avg);
 }
 static float avg(int tr,int notno,int noi)
 {
   return tr/(noi-notno);
 }
 
  static void sort(Cricket_Player ob[],int n)
 {
   int i,pass;
   for(pass=1;pass<n;pass++)
   {
     for(i=0;i<n-pass;i++)
     {
        if(ob[i].bat_avg>ob[i+1].bat_avg)
        {
            Cricket_Player t=ob[i];
            ob[i]=ob[i+1];
            ob[i+1]=t;
          }
     }
   }
    for(i=0;i<n;i++)
    {
     System.out.println(ob[i].name+"\t"+ob[i].noi+"\t"+ob[i].notno+"\t"+ob[i].tr+"\t"+ob[i].bat_avg);
    }
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
   sort(ob,n);      //satic method(calling)
}
}


