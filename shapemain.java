//Shapemain.java
import java.util.*;
import shape.*;
import shape.triangle;
public class shapemain
{
     public static void main(String args[])
     {
int ch;
           String st="";
           Scanner s=new Scanner(System.in);
           while(true)
           {
                   try
                  {
System.out.println("1.Area of sqauare\n2.Area of circle\n3.Area of triangle\n4.Exit\nEnter your choice:");
st=s.next();
ch=Integer.parseInt(st);
                   switch(ch)
                  {
	       case 1:  System.out.println("Enter sides");
                                    float a=s.nextFloat();
                                    square sq=new square(a);
sq.sq_area();
                                    break;
                     case 2:  System.out.println("Enter radius");
                                  a=s.nextFloat();
                                  circle c=new circle(a);
c.c_area();
                                  break;
                     case 3: System.out.println("Enter length and breadth");
                                  a=s.nextFloat();
                                  float b=s.nextFloat();
                                  triangle t=new triangle(a,b);
t.t_area();
                                 break;
                     case 4: System.exit(0);
                                  break;
default:System.out.println("Invalid choice");
System.out.println("------------------------");
               }
         }
catch(NumberFormatException e)
         {
	System.out.println("Invalid Input");
	System.out.println("------------------------");
           }
       }
   }
}
