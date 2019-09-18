package package_tasks;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LoopTask implements Runnable {
String task;
private static int counter=0;
private static int id;

public LoopTask(String test) {
	// TODO Auto-generated constructor stub
id=++counter;
	task=test;


}
	@Override
	public void run() {
		// TODO Auto-generated method stub
for (int  x = 0 ; x < 10 ; x++ )
{
	try{
		TimeUnit.SECONDS.sleep(2);
		System.out.println(new Date().toLocaleString());
	}
	catch (Exception e )
	{}
	System.out.println(task+" "+x);
}
	
	}

}
