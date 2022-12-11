package com.java.concurrency;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
	public static void main(String[] args) {
		//Integer total = null;
		/*AtomicInteger total = new AtomicInteger();
		Optional<Integer> b = Optional.of(new Integer(10));
		b.ifPresent(c -> total.set(c));
		System.out.println("total "+total);*/
		
		StringBuilder val = new StringBuilder();
		int[] arr = {1,2,3,4};
		Arrays.stream(arr).filter(i -> i%2 ==0).mapToObj(i -> val.append(String.valueOf(i)));
		
		//CyclicBarrier
		//ExecutorService
		//Executors
		
		//BlockingDeque
		/*1
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup tg = new ThreadGroup("First Thread");
		System.out.println(tg.getParent().getName());
		
		ThreadGroup tg1 = new ThreadGroup(tg, "Second Thread");
		System.out.println(tg1.getParent().getName()); */
		
		/*2
		ThreadGroup tg = new ThreadGroup("Thread Group");
		Thread t1 = new Thread(tg, "First Thread");
		Thread t2 = new Thread(tg, "Second Thread");
		System.out.println("T1 Priority "+t1.getPriority());
		System.out.println("T2 Priority "+t2.getPriority());
		
		tg.setMaxPriority(3);
		Thread t3 = new Thread(tg, "Third Thread");
		System.out.println("After : T1 Priority "+t1.getPriority());
		System.out.println("After : T2 Priority "+t2.getPriority());
		System.out.println("After : T3 Priority "+t3.getPriority());
		
		//5 5 3*/
		/*
		Thread[] threads = new Thread[10];
		ThreadGroup tg = new ThreadGroup("Thread Group");
		tg.getParent().getParent().enumerate(threads);
		System.out.println(Arrays.toString(threads));
		*/
		/*
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread t1 : t) {
			System.out.println(t1.getName()+" "+t1.isDaemon());
		}*/
	}
}
