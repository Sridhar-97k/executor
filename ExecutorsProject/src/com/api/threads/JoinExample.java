package com.api.threads;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread starts here ");
		Thread thread1= new Task("Thread 1 ");
		Thread thread2= new Task("Thread 2 ");
		Thread thread3= new Task("Thread 3 ");
		Thread thread4= new Task("Thread 4 ");
		
		
		thread1.start();
		
		try {
			thread1.join();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		try {
			thread2.join();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread3.start();
		try {
			thread3.join();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread ends here ");
	}

}
class Task extends Thread
{
	private static int count=0;
	private int id;
	private String str;
	Task(String str)
	{
		this.str=str;
		id=count++;
		
	}
public void run()
{
	Integer i=0;
	for(i=0;i<10;i++)
	{
		System.out.println(str+" Id : <"+id+">"+"Hello"+i);
		
	}
}

}