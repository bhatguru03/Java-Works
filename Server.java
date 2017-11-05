import java.io.*;
import java.net.*;

class Server
{
	public static void main(String a[]) throws Exception
	{
		ServerSocket ss= new ServerSocket(1090);
		Socket socket = ss.accept();
		
		try
		{
			
			System.out.println("Server is Running and Listening...");
			
			while (true) {
                
                try {
                    PrintWriter out =new PrintWriter(socket.getOutputStream(), true);
					BufferedReader input =new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String text=input.readLine();
					System.out.println(">>>"+text);
					out.println("Server got the Message...");
					} catch(Exception ex){}
                  
                
            }
			
			
		}
		finally{
			  socket.close();
				ss.close();
			}
		
		
	}
}