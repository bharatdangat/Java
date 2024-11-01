//Accept matrix and display transpose
import java.util.*;
class Transpose
{
  public static void main(String arg[])
  {
    int m,n,i,j;
    int a[][]=new int[10][10];
//syntax-datatype arrayname[][]=new datatype[size]

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number of rows-");
    m=sc.nextInt();
   System.out.println("Enter Number of cols-");
     n=sc.nextInt();
    System.out.println("Enter Matrix-");
    for(i=0;i<m;i++)
    {
     for(j=0;j<n;j++)
     {
        a[i][j]=sc.nextInt();
     }
    }
    System.out.println("Display Matrix-");
    for(i=0;i<m;i++)
    {
     for( j=0;j<n;j++)
     {
      System.out.print(a[i][j]+"\t");
     }
     System.out.println("");
    }
    System.out.println("Display Transpose Matrix-");
    for( i=0;i<n;i++)
    {
     for( j=0;j<m;j++)
     {
      System.out.print(a[j][i]+"\t");
     }
     System.out.println("");
    
  }
}
}
