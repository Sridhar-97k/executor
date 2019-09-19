
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class Sender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String send_string="Send this string";
DatagramSocket socket=null;
Scanner s1=null;
DatagramPacket packet;
try {
socket=new DatagramSocket(9898);
s1=new Scanner(System.in);
} catch (SocketException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	while(true)
	{
		
		System.out.println("Press any key to send message");
		s1.next();
		packet=new DatagramPacket(send_string.getBytes(),send_string.length());
		try {
			socket.send(packet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}

}
