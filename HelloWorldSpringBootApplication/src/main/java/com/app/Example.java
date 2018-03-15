package com.app;

public class Example {

	public static void main(String[] args)throws Exception {
		
		Object o = Class.forName(args[0]).newInstance();
		System.out.println("Object is created :"+o.getClass().getName());

	}

}
