/*write menu driven program to perform following operation 
1]calculate volume of cylinder(v=3.14r^2h)
2]find factorial of given no
3]check number is armstrong or not
->*/

//not write util.* becoz not use.
package TY;   //folder name and package name must be same......
public class Calculate //file name and class name must be same
{
 public void cylinder(float r,float h)           //all clasess and methods are public.........
 {
  float v=3.14f*r*r*h;
  System.out.println("Volume of cylinder-"+v);
 }
 public void factorial(int n)
 {
  int f=1;
  for(int i=1;i<=n;i++)
  {
   f=f*i;
  }
  System.out.println("Factorial="+f);
 }
 public void armstrong(int n)
 {
  
  int n1=n;
  int s=0;
  while(n>0)
  {
   int d=n%10;
   s=s*10+d;
   n=n/10;
  }
  if(n1==s)
  System.out.println("Number is armstrong");
  else
  System.out.println("Number is not armstrong");
 }
 }
 

