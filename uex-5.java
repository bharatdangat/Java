  //define class "mydate (day,month,year) with methods accept and display Mydate object acecept data as dd,mm,yy through user defined exception "invslid date exception" if date is invalid.....
  import java.util.*;
  class InvalidDateException extends Exception
  {
   public String toString()
   
   {
      return "InvalidDateException........";
   }
  }
  class MyDate
  {
    int dd,mm,yy;
    void accept(int dd,int mm,int yy)
    {
      this.dd=dd;
       this.mm=mm;
       this.yy=yy;

    }
    void disp()
    {
     System.out.println("Date-"+dd+"/"+mm+"/"+yy);
    }
    public static void main(String arg[])
    {
      try
      {
              Scanner sc=new Scanner(System.in);
      System.out.println("Enter dd mm yy");
    int   dd=sc.nextInt();
      int mm=sc.nextInt();
      int  yy=sc.nextInt();
      MyDate ob=new MyDate();
         ob.accept(dd,mm,yy);
 
         if(!((mm==4||mm==6||mm==9||mm==11)&&(dd<=30)))
         throw new InvalidDateException();
           if(!((mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)&&(dd<=31)))
         throw new InvalidDateException();
                     ob.disp(); 
          }
          if (mm == 2) { // February
            if (isLeapYear(yy) && dd > 29) {
                throw new InvalidDateException();
            }  if (!isLeapYear(yy) && dd > 28) {
                throw new InvalidDateException();
            }
          catch(Exception e)
          {
           System.out.println(e);
          }
      }
    }
  
  
