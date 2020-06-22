package com.exception.demo;

public class DemoC {
	public static void main(String[] args) {
		try(DemoB demo = new DemoB();){
			demo.showIO();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}