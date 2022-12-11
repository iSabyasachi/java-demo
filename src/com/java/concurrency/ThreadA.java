package com.java.concurrency;

class ThreadB extends Thread{
	int total;
	public void run() {
		System.out.println("child thread starts run()");
		synchronized(this){
			System.out.println("child thread starts calculation");
			for(int i = 1 ; i <= 100 ; i++) {
				total += i;
			}
			System.out.println("child thread trying to call notify()");
			this.notify();
		}		
	}
}

public class ThreadA{
	public static void main(String[] args) throws InterruptedException{
		
		ThreadB tb = new ThreadB();	
		
		Thread.sleep(10000);
		
		synchronized(tb){	
			tb.start();	
			System.out.println("main thread trying to call wait()");
			tb.wait();
		}
		System.out.println("main thread got notification");
		System.out.println(tb.total);
	}
}
