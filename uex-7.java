//EMAILID
class InvalidException extends Exception
{
   public String toString()
   {
    return "Invalid username or password.........";
   }
}
class EmailId
{
  String username,password;
   EmailId()               //default constructor.........
   {
      username="CAUTION";
      password="Bharatdangat2005";
   }
   EmailId(String username,String password)    //para constructor.....
   {
    this.username=username;
    this.password=password;
   }
   void disp()
   {
    System.out.println("Username="+username);
    System.out.println("Password="+password);
   }

public static void main(String arg[])
{
 try
 {
    String username=arg[0];
    String password=arg[1];          //accept values from command line.....
    
    for(int i=0;i<username.length();i++)
    { 
      char ch=username.charAt(i);
      if(!Character.isUpperCase(ch))
      throw new InvalidException();
    }
    if(username.length()<5)
    throw new InvalidException();
  
  int u=0,p=0,l=0,d=0;
   for(int i=0;i<password.length();i++)
   {
        char ch=password.charAt(i);
        if(Character.isUpperCase(ch))
        u=1;
        if(Character.isLowerCase(ch))
        l=1;
        if(Character.isDigit(ch))
        d=1;
   }
   if(!(u==1&&l==1&&d==1))
   throw new InvalidException();
   EmailId ob=new EmailId();
   ob.disp();
 }
 catch(InvalidException e)
 {
   System.out.println(e);
 }
}

}
