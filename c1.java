/*print pattern uding java
5
4 5
3 4 5
2 3 4 5 
1 2 3 4 5

*/
class pattern
{
 public static void main(String argc[])
 {
  for(int i=5;i<=1;i--)
  {
   for(int j=5;j<=i;j--)
   {
    System.out.print(+j);
   }
   System.out.println(" ");
  }
 }
}
