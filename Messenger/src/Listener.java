import src.Listen;
public class Listener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Receiver "+Thread.currentThread().getName()+" thread started");

Runnable listener = new Listen();
Thread listener_thread=new Thread(listener);
listener_thread.setName("Receiver thread ");
listener_thread.start();
	}

}
