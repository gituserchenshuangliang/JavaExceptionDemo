package com.exception.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoB implements AutoCloseable{
	public  FileInputStream fis;
	public FileOutputStream fos ;
	public void showIO () throws IOException {
		File file = new File("src/com/exception/demo/A.properties");
		if(!file.exists()) {
			file.createNewFile();
		}
		fos = new FileOutputStream(file);
		fos.write("name=Chen".getBytes());
		fis = new FileInputStream("src/com/exception/demo/DemoA.java");
		int i ;
		byte[] b = new byte[2024];
		while((i = fis.read(b)) > 0) {
//			System.out.println(new String(b));
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("Auto Closed Resources !");
	}

}
