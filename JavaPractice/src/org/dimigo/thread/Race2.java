package org.dimigo.thread;

public class Race2 {
	
	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Thread t1 = new Runner("방현우");
		Thread t2 = new Runner("김현우");
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
		
	}

}
