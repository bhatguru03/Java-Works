import java.util.*;
import java.lang.Math;
import java.io.*;
class Arithmetic
  {
	int a,b;
	Scanner s1=new Scanner(System.in);
	Arithmetic()
	{
		System.out.println("Enter any 2 integers");
		a=s1.nextInt();
		b=s1.nextInt();
	}
	void display()
	{
		System.out.println("\nAddition \t= "+(a+b));
		System.out.println("Substraction \t= "+(a-b));
		System.out.println("Multiplication \t= "+(a*b));
		System.out.println("Division \t= "+(a/b));
	}
	Arithmetic (float a1, float b1)
	{
		System.out.println("\nAddition \t= "+(a1+b1));
		System.out.println("Substraction \t= "+(a1-b1));
		System.out.println("Multiplication \t= "+(a1*b1));
		System.out.println("Division \t= "+(a1/b1));
	}
	void display(int x)
	{
		System.out.println("square of "+x+" is "+(x*x));
	}
   }
class ArithmeticMain
  {
	public static void main(String args[])throws InputMismatchException
	{
		
		try{
			Scanner s1=new Scanner(System.in);
			System.out.println("Arithmetic operation on integer\n ===================");
			Arithmetic a=new Arithmetic();
			a.display();
			System.out.println("\n\nAirthmetic operation on float\n==================");
			System.out.println("Enter any 2 float value");
			float a1=s1.nextFloat();
			float a2=s1.nextFloat();
			Arithmetic arth1=new Arithmetic(a1,a2);
			System.out.println("\nEnter no to find square\n========================");
			int x=s1.nextInt();
			a.display(x);
		}catch(InputMismatchException e)
			{
			System.out.println("\nEnter only Integers\t:"+e);
			}
	}
  }
