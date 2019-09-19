

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Sender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String send_string="Send this string";
DatagramSocket socket;
try {
socket=new DatagramSocket(9898);
} catch (SocketException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
