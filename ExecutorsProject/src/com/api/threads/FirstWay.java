package com.api.threads;

import java.util.concurrent.TimeUnit;

public class FirstWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread starts here ");
		 new FirstTask("Task 1 ");
		 new FirstTask("Task 2 ");
		 new FirstTask("Task 3 ");
		 new FirstTask("Task 4 ");
		 
	System.out.println("main thread ends here ");
	}

}
class FirstTask extends Thread
{
	private static int count=0;
	private   int id;
	private static int stringcount=0;
	private String str;
	FirstTask(String str)
	{	this.str=str;
		id=count++;
		start();
		
	}
	
	
public void run()
{
for ( int x = 0 ; x < 10 ; x ++)
{
try{
	TimeUnit.MILLISECONDS.sleep(200);
}
catch (InterruptedException e )
{
	System.out.println(e);
}
	System.out.println(str+" Hello " + x+" id : <"+id+">");	



}

}
}