//display date and time using user defined package........
import java.util.Date;
class Demo
{
  public static void main(String arg[])
  {
       Date d1=new Date();
       System.out.println("Date &Time-"+d1);
       int dd=d1.getDate();
       int mm=d1.getMonth()+1;
       int yy=d1.getYear()+1900;
       System.out.println("Date="+dd+"/"+mm+"/"+yy);
       int hr=d1.getHours();
       int min=d1.getMinutes();
       int sec=d1.getSeconds();
       System.out.println("Time-"+hr+":"+min+":"+sec);
  }
}
