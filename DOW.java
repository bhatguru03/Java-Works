import java.util.*;
class DOW
{
   public enum dayofweek
   {
sunday,monday,tuesday,wednesday,thursday,friday,saturday;
   }
   public boolean
workday(dayofweek dow)
   {
	   switch(dow)
	   {
		   case sunday: return false;
 case monday:return true;
		   case tuesday:return true;
		   case wednesday:return true;
		   case thursday:return true;
		   case friday:return true;
		   case saturday:return false;
		default:return false;
  }
   }
   public static void main(String args[])
   {
int ch=1;
String s1="";
 while(ch!=2)
{
	        try
	        {
Scanner in=new Scanner(System.in);
System.out.println("enter day");
		String s=in.nextLine();
		dayofweek dow=dayofweek.valueOf(s);
	DOW dow1=new DOW();
	 if(dow1.workday(dow))
	System.out.println("Working day");
	else
	System.out.println("Not a working day");
try
{
	System.out.println("Do you want to Continue :1.Yes 2.No");
		 s1=in.next();
		ch=Integer.parseInt(s1);
	}
catch(NumberFormatException e)
                      {
System.out.println("\nEnter Only Number");
	}
	}
catch(IllegalArgumentException e)
 {
System.out.println("Invalid Argument");
}
		
         }
    }
}
