import java.io.*;
class Demo
{
 public static void main(String arg[])throws Exception
 {
  File f1=new File("JAVA");
   if(f1.exists())
   {
     System.out.println("found..");
     if(f1.isFile())
     System.out.println("it is file.......");
     if(f1.isDirectory())
     System.out.println("it is folder.......");
     if(f1.canRead())
     System.out.println("file permission readable.......");
     if(f1.canWrite())
     System.out.println("file permission is writable......");
     System.out.println("File Name="+f1.getName());
     System.out.println("Parent File Name="+f1.getParentFile());
     System.out.println("File full path="+f1.getAbsolutePath());
     System.out.println("File length="+f1.length());
   }
 }
}
