import java.util.*;
interface rectangle
{
	public abstract void arear();
}
interface triangle
{
	public abstract void areat();
}
class calculate implements rectangle,triangle
{
	float l,w,b,h;
	void getrect()
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter length :");
		l=s.nextFloat();
		System.out.println("Enter width :");
		w=s.nextFloat();
	}
	void gettri()
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter breadth :");
		b=s.nextFloat();
		System.out.println("Enter height :");
		h=s.nextFloat();
	}
	public void arear()
	{
		System.out.println("\nArea of Rectangle is :"+(l*w));
System.out.println("---------------------------------");
            }
	public void areat()
	{
		System.out.println("\nArea of Triangle is :"+(0.5*h*b));
System.out.println("---------------------------------");
            }
            public static void main(String args[])
           {
	           calculate cal=new calculate();
	            String s1=" ";
	int choice=1;
	            while(choice!=3)
	           {
	                try
	               {
                               Scanner s=new Scanner(System.in);
		System.out.println("1.Area of Rectangle\n2.Area of Triangle\n3.Exit\nEnter your choice :");
	                  s1=s.next();
	                  choice=Integer.parseInt(s1);
	                  switch(choice)
	                 {
		           case 1:  cal.getrect();
	cal.arear();
	                                    break;
	                       case 2:  cal.gettri();
	cal.areat();
	                                    break;
	                      case 3:  System.exit(0);
	                                   break;
	                      default:  System.out.println("Inavlid choice");
	                 }
		  }
catch(NumberFormatException e)
                        {
		System.out.println("\nEnter only number");
			}
			catch(InputMismatchException e)
                        {
		System.out.println("\nEnter only Integers :\t"+e+"\n");
		}
           }
     }
}
