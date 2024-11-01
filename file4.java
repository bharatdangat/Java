//write java program to count no of digit,spaces and charcter from file
//we use fileinputstream 
import java.io.*;
import java.util.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter file name-");
     String s1=sc.next();
     FileInputStream f1=new FileInputStream(s1);
     int k,d=0,s=0,c=0,sym=0;
     while((k=f1.read())!=-1)
     {
         // if(k>='0'&&k<='9')
         if(Character.isDigit(k))
          d++;
          else if(Character.isLetter(k))
          //else if((k>='A'&&k<='Z')||(k>='a'&&k<='z'))
          c++;
          else if(Character.isWhitespace(k))
          //else if(k==' ')
          s++;
          else
          sym++;
     }
      System.out.println("No Of Digits-"+d);
      System.out.println("No Of Characters-"+c);
      System.out.println("No Of Spaces-"+s);
      System.out.println("No Of Symbols-"+sym);
     f1.close();
  }
}

/*o/p==
Enter file name-
file1.java
No Of Digits-4
No Of Characters-179
No Of Spaces-55
No Of Symbols-69

*/
