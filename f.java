//print fibnacci series........
class fibonacci
{
 public static void main(String argc[])
 {
  int i;
  int a=0;
  int b=1;
  System.out.print(" "+a);
  System.out.print(" "+b);
  int c;
  for(i=1;i<10;i++)
  {
  c=a+b;
  System.out.print(" "+c);
  a=b;
  b=c;
}
}
}
