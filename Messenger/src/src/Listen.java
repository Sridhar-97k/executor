package src;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Listen implements Runnable {
private Socket socket;
DatagramSocket ds ;
DatagramPacket dp ;
byte[] buf = new byte[1024];  
/*
 *=   
      
    ds.close();  
 * 
 * 
 * 
 * 
 * */
	public Listen()
	{
		
		try{
			
			ds=new DatagramSocket(9898);
		
		}
		catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" thread started");
		// TODO Auto-generated method stub
while(true)
{
	
    dp= new DatagramPacket(buf, 1024);  
    try {
		ds.receive(dp);
	    String str = new String(dp.getData(), 0, dp.getLength());  
	    
	    System.out.println("Message received was "+str);
	    System.out.println("Message received at "+new Date().getTime());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  

}
	}

}
