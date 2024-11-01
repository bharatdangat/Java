//write java program to  display all even numbers using command line argument.......
class Even
{
 public static void main(String arg[])
 {
   System.out.println("evwn nos-");
   for(int i=0;i<arg.length;i++)
   {
     int n=Integer.parseInt(arg[i]);
     if(n%2==0)
     System.out.print(" "+n);
   }
 }
}
