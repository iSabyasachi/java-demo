package com.java.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TpsReport {
	public void submitReports() throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newCachedThreadPool();
		Future bosses = service.submit(() -> System.out.println(""));
		service.shutdown();
		System.out.println(bosses.get());
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		new TpsReport().submitReports();
	}
}
