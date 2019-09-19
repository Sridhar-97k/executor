package Tasks;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

public class Listen implements Runnable {
private Socket socket;
DatagramSocket ds ;
DatagramPacket dp ;
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
	ds=new DatagramSocket(3000);
		}
		catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
while(true)
{
	byte[] buf = new byte[1024];  
    dp= new DatagramPacket(buf, 1024);  
    try {
		ds.receive(dp);
	    String str = new String(dp.getData(), 0, dp.getLength());  
	    
	    System.out.println("Message received was "+str+"Msg received on ");
	    

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  

}
	}

}
