import java.io.*;

import java.net.*;

class UDPServer{ 

public static DatagramSocket serversocket; 

public static DatagramPacket dp; 

public static BufferedReader dis;

public static InetAddress ia; 

public static byte buf[]=new byte[1024];

public static int cport=5555, sport=5556; 

public static void main(String[] args) throws IOException{ 

serversocket=new DatagramSocket(sport); 

dp=new DatagramPacket(buf,buf.length); 

dis=new BufferedReader(new InputStreamReader(System.in)); 

ia=InetAddress.getLocalHost(); 

System.out.println("\nServer is running.,.,.,.,"); 

while(true){ 

serversocket.receive(dp); 

String str=new String(dp.getData(),0,dp.getLength()); 

if(str.equals("STOP")){ 

System.out.println("\nTerminated......!!!!"); 

break; 

} 

System.out.println("Client: " +str); 

String str1=new String(dis.readLine()); 

buf=str1.getBytes(); 

serversocket.send(new DatagramPacket(buf,str1.length(),ia,cport)); 

} 

}

}
