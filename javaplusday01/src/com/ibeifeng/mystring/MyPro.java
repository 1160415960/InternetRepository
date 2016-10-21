package com.ibeifeng.mystring;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MyPro {

	public static void main(String[] args) throws IOException {
		//�õ������ļ�����
		File file = new File("src/jdbc.properties");
		//��ȡ������
		FileInputStream in = new FileInputStream(file);
		//�õ����������ļ��Ķ���
		Properties properties = new Properties();
		//���������ļ�
		properties.load(in);
		//��ȡ�����ļ���key��value
		String driverClass = properties.getProperty("driverclass");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		//��ӡ
		System.out.println(driverClass);
		
		FileOutputStream out = new FileOutputStream(new File("src/jdbc.properties"));
		Object comments = properties.setProperty("name", "wang");
		properties.store(out, (String) comments);
		System.out.println("���");
	}

}
