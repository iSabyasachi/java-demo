package com.java.design;

import com.java.design.OuterClass.InnerClass;
import com.java.design.OuterClass.InnerStaticClass;

public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.outerClassMethod();
		
		InnerClass inner = outer.new InnerClass();
		inner.innerClassMethod();
		
		InnerStaticClass innerStatic = new InnerStaticClass();
		innerStatic.innerStaticClassMethod();
	}
}
