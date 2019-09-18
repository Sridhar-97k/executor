package com.api.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

import package_tasks.LoopTask;

import java.util.concurrent.ExecutorService;
import java.util.zip.*;
public class ExecutorExample {
	 

	public static void main(String args[])
{
		
	ExecutorService executor=Executors.newSingleThreadExecutor();
	 executor.execute(new LoopTask("Task 1 "));
	 executor.execute(new LoopTask("Task 2 "));
	 executor.execute(new LoopTask("Task 3 "));
	 executor.shutdown();		
}
}
class MyTask implements Runnable
{
	private String task;
	public void run()
	{
		System.out.println();
		
	}
	public MyTask()
	{
		
		
	}
	}