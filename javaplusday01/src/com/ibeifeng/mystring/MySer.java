package com.ibeifeng.mystring;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySer {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("e:/wc.input");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new User("zhangsan","nan",1));
		
		oos.flush();
		
		oos.close();
	}
}
