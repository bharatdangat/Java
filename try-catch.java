class Demo
{ 
 public static void main(String arg[])
 {
  try
  {
   String s1="bharatr";
   int n=Integer.parseInt(s1);
   System.out.println("value-"+n);
  }
   catch(Exception e)
   {
    System.out.println(e.getMessage());
   }
 }
}
