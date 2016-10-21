package com.ibeifeng.mystring;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MyPro {

	public static void main(String[] args) throws IOException {
		//得到属性文件对象
		File file = new File("src/jdbc.properties");
		//获取输入流
		FileInputStream in = new FileInputStream(file);
		//得到解析属性文件的对象
		Properties properties = new Properties();
		//解析属性文件
		properties.load(in);
		//获取属性文件的key和value
		String driverClass = properties.getProperty("driverclass");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		//打印
		System.out.println(driverClass);
		
		FileOutputStream out = new FileOutputStream(new File("src/jdbc.properties"));
		Object comments = properties.setProperty("name", "wang");
		properties.store(out, (String) comments);
		System.out.println("完成");
	}

}
