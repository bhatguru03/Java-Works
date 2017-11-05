import java.util.*;
import java.io.*;
class stringy
{
	void stringwork(){
	String s1,s2,s3,s4,s5;
	int i,l;
	s2=" ";
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the string : \t\t\t");
	System.out.println("\n=======================\t");
	s1=sc.nextLine();
	if(s1.matches("\\d+"))
	System.out.println("\nInvalidString :");
	else
	     {
			
			System.out.println("\nEntered string is : \t\t\t "+s1);
			System.out.println("\nlength of the string is : \t\t "+s1.length());
			
			l=s1.length();
			if(l==0)
			System.out.println("\nString is empty cannot be reversed");
			else
			{
				for(i=l-1;i>=0;i--)
				{
						s2=s2+s1.charAt(i);
				}
			System.out.println("\nThe reversed string is : \t\t"+s2);
			s3=s2.toUpperCase();
			System.out.println("\nUpper case of reverse string is : \t"+s3);
			
			System.out.println("\nEnter a new string : \t");
			System.out.println("\n=======================\t");
			s4=sc.nextLine();
			if(s4.matches("\\d+"))
			System.out.println("\nInvalidString :");
			else
			{
	
				System.out.println("\nThe entered new string is : \t\t "+s4);
				s5=s4.concat(s3);
				System.out.println("\nThe appended string is : \t\t "+s5);
			}
		
			}
		}
	}
}
class StringHandler
  {
    public static void main(String s[]) throws IOException
      {
	int ch=1;
	stringy s1=new stringy();
	while(ch!=2)
	{
		
		s1.stringwork();
		try
		{
			
			
				

				System.out.println("Do you want to continue 1.YES 2.NO");
				  Scanner in=new Scanner(System.in);
			
				  String s2=in.nextLine();
				ch=Integer.parseInt(s2);
				
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("\nEnter Only Numbers");
		}
	}

      }
 }
