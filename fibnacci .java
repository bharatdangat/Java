//print fibnacci series........
package TY;
public class fibonacci
{
 public void fibonacci()
 {
 Scanner sc=new Scanner(System.in);
  int i;
  int a=0;
  int b=1;
  System.out.println("Enter Limit-");
  int n=sc.nextInt();
  for(i=1;i<n;i++)
  {
  c=a+b;
  System.out.println(+c);
  a=b;
  b=c;
}
}
}
