package com.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_PingPong {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
Runnable runnable=new Runnable() {

	public void run()
	{
		for(int i=0;i<20;i++) {
			System.out.println("PING");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
};
Runnable runnable1=new Runnable() {
	
	public void run()
	{
		for(int i=0;i<20;i++) {
			System.out.println("\tPONG");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
};

executor.execute(runnable);
executor.execute(runnable1);
}
}