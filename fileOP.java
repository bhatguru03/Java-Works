
import java.io.*;
class fileOP
{
	public static void main(String[] args)
	{
	FileInputStream Fin=null;
	FileOutputStream Fout=null;
	int i,j;
	if(args.length!=2)
	   {
		System.out.println("NOt COpied");
		return;
	   }
	try
	   {
		Fin = new FileInputStream(args[0]);
		Fout = new FileOutputStream(args[1]);
		do{
			i=Fin.read();
			if(i!=-1)
			Fout.write(i);
		}while(i!=-1);
		String workingDir = System.getProperty("user.dir");
		System.out.println("current directory->"+workingDir);
		System.out.println("\nContent Copied Successfully..!");
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
