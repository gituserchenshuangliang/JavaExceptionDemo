package com.exception.demo;

public class DemoD {

	public static void main(String[] args) {
		try {
//			int i = Integer.parseInt(args[0]);
			Integer x = Integer.parseInt("one");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
