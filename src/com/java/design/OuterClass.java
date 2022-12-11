package com.java.design;

public class OuterClass {
	int val = 8;
	int test = 100;
	
	public OuterClass(){
		System.out.println("OuterClass Instance is getting created!!!");
	}
	
	public void outerClassMethod() {
		System.out.println("Inside Outer Class Method, and val is "+val);
	}
	
	public class InnerClass{
		int val = 10;		
		
		public InnerClass(){
			System.out.println("InnerClass Instance is getting created!!!");
		}
		
		public void innerClassMethod() {
			System.out.println("Inside Inner Class Method, and val is "+val);
			System.out.println("test "+test);
		}
	}
	
	public static class InnerStaticClass{
		int val = 12;
		
		public InnerStaticClass(){
			System.out.println("InnerStaticClass Instance is getting created!!!");
		}
		
		public void innerStaticClassMethod() {
			System.out.println("Inside Inner Static Class Method, and val is "+val);
		}
	}
}
