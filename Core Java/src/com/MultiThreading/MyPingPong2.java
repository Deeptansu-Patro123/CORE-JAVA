package com.MultiThreading;

public class MyPingPong2 extends Thread {


	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("PING");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("\tPONG");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r3 = new Runnable() {
			public void run() {
				for(;;) {
					System.out.println("\t \tTONG");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.setDaemon(false);
		Thread t2 = new Thread(r2);
		t2.setDaemon(false);
		Thread t3=new Thread(r3);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("PING")) {
			for(int i=0;i<20;i++) {
				System.out.println("PING");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().equals("PONG")) {
			for(int i=0;i<20;i++) {
				System.out.println("\tPONG");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}