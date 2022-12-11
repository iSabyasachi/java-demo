package com.java.concurrency;

public class MyThread extends Thread{
	public void run() {
		System.out.println("2 ->>>"+Thread.currentThread().getName());
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(i+" Child Thread");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1 ->>> "+Thread.currentThread().getName());
		MyThread t = new MyThread();
		t.start();
		//t.run();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(i+" Parent Thread");
		}
		t.test();
	}
	public void test() {
		System.out.println("3 ->>>"+Thread.currentThread().getName());
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(i+" Parent Thread Test");
		}
		Object obj = new Object();
	}
}
