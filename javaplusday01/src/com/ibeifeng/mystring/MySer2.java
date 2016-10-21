package com.ibeifeng.mystring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class MySer2 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("d:/wc.input");
		ObjectInputStream ois = new ObjectInputStream(in);
		User user = (User) ois.readObject();
		System.out.println(user.getName());
		System.out.println(user.getGender());
		System.out.println(user.getAge());
		
	}

}
