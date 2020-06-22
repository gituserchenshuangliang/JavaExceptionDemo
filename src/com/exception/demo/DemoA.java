package com.exception.demo;

import static java.lang.System.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Cherry
 * 2020年4月2日
 */
public class DemoA {

	public static void main(String[] args) throws FileNotFoundException,IOException{
//			int i = c();
//			out.println(i);
		d();
	}
	public static void d() {
		Scanner scan = new Scanner(System.in);
		Integer i = scan.nextInt();
		assert (i > 0 ) : "小于0";
	}
	//finally和return
	public static int c() {
		try {
			int i = 1/1;
//			int j = 1/0;
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			out.println("return返回前执行");
		}
		return 1;
	}
	public static void b() throws IOException {
		//自动关闭资源
		File file = new File("src/com/exception/demo/a.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		try(FileOutputStream fos = new FileOutputStream(file);){
			fos.write("name=Cherry".getBytes());
		}
	}
	
	public static void a() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		while(i != 0) {
			try {
			i = scan.nextInt();
				sum += i;
			} catch (Exception e) {
				StackTraceElement[] st = e.getStackTrace();
				System.out.printf("异常信息：%d条！%n",st.length);
				for (StackTraceElement s : st) {
					System.out.println(s.toString());
				}
				out.printf("%s not a Nunber%n输入下一个：%n",scan.next());
			}
		}
		out.printf("求和：%d",sum);
	}
}
