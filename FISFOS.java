import java.io.*;
import java.util.Scanner;

class FISFOS
{
	public static void main(String[] args)
	{
	FileInputStream Fin=null;
	FileOutputStream Fout=null;
	int i,j;
	String a1,a2;
	Scanner sn= new Scanner(System.in);
	if(args.length!=2)
	   {
		System.out.println("Copying.,.,.,");
		return;
	   }
	try
	   {
		System.out.println("Enter SOurce file name:");	
		a1=sn.nextLine();
		System.out.println("Enter Destination file name:");		
		a2=sn.nextLine();
		File f= new File("f2");
		Fin = new FileInputStream("a1");
		if("a1".exists)
			Fout = new FileOutputStream("a2");
		else
		{
			File f= new File("f2");
						Fout = new FileOutputStream(f2);
		}
		do{
			i=Fin.read();
			if(i!=-1)
			Fout.write(i);
		}while(i!=-1);
		System.out.println("\nCopied!");
	    }
	catch(FileNotFoundException e)  {
		e.printStackTrace();
	    }
	catch(IOException e){
		e.printStackTrace();
	    }
	try{
		Fin.close();
		Fout.close();
	    }
	catch(IOException e)
	    {
		System.out.print("\nError while closing.,.,\n");
	    }
	}
}