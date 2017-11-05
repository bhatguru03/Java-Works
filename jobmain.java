import java.util.*;
class employee
{
	String name;
	int eid;
	int age;
	float salary;
	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEntername :");
		name=s.nextLine();
		System.out.println("\nEnterEmp.ID :");
		eid=s.nextInt();
		System.out.println("\nEnterage :");
		age=s.nextInt();
		System.out.println("\nEntersalary :");
		salary=s.nextFloat();

	}
	void showdata()
	{
		System.out.println("\nNameis :"+name);
		System.out.println("\nEmp.ID is :"+eid);
		System.out.println("\nageis :"+age);
		System.out.println("\nsalaryis :"+salary);

	}
}
class emp extends employee
{
	float da,da1,ta,ta1,hra,hra1,total;
	void getdata()
	{
		super.getdata();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter TA :");
		ta=s.nextFloat();
		System.out.println("Enter DA:");
		da=s.nextFloat();
		System.out.println("Enter HRA :");
hra=s.nextFloat();
	System.out.println("-------------------------------------");
		ta1=salary*ta;
		da1=salary*da;
		hra1=salary*hra;
		total=ta1+da1+hra1+salary;
	}
	void showdata()
	{
		super.showdata();
		System.out.println("\nTAis :"+ta1);
		System.out.println("\nDAis :"+da1);
		System.out.println("\nHRAis :"+hra1);
		System.out.println("\nTotal salary is :"+total);
		System.out.println("-------------------------------------");
	}
}
class jobmain
{
	public static void main(String args[])
	{
		String ch=" ";
		int choice=1;
		try
		{
		    while(choice!=2)
		    {

			int n;
			    Scanner s1=new Scanner(System.in);
			System.out.println("Enter number of employees :");
			ch=s1.next();
		                   n=Integer.parseInt(ch);
		 emp e[]=new emp[n];
			System.out.println("Enter "+n+" employee details");
			for(int i=0;i<n;i++)
			    {
				  e[i]=new emp();
				  e[i].getdata();
			    }
			System.out.println("************Employeedetails************");
			for(int i=0;i<n;i++)
			    {
				  e[i].showdata();
		                }
System.out.println("Do you want to Continue :1.Yes 2.No");
		ch=s1.next();
		        choice=Integer.parseInt(ch);
		    }
	     }
	catch(NumberFormatException e)
                {
		System.out.println("\nEnter Only Numbers");
                 }
	catch(InputMismatchException e)
	        {
		System.out.println("\nEnter Only Integers for employeeID\t:"+e);	
		}
	 }
}
