package com.api.threads;

public class ThreadUsingOnlyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i  < 10;i++)
		{
			
			System.out.println("Thread 1 "+i);
		}
	}
}).start();
new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i  < 10;i++)
		{
			
			System.out.println("Thread 2 "+i);
		}
	}
}).start();
	}

}
