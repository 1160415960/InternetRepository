package com.ibeifeng.mystring;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class MyString {
	public static void main(String[] args) throws Exception {
//		String str1="hello";
//		String str2="hello";
//		String str3=new String("hello");
//		String str4=new String("hello");
//		System.out.println(str1==str2);
//		System.out.println(str1==str3);
//		System.out.println(str3==str4);
		
		/*String str="Welcome to Beifeng";
		int index = str.indexOf("e");
		System.out.println(index);
		int lastIndex = str.lastIndexOf("e");
		System.out.println(lastIndex);
		System.out.println(str.substring(3));//截取下标从3开始 左闭右开
		System.out.println(str.substring(0, 3));
		String string = new String(str.getBytes("iso-8859-1"),"utf-8");
		System.out.println(string);
		System.out.println(str.replace("e", "f"));
		System.out.println(str.replaceAll("to", "Too"));
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			System.out.print(c+",");
			System.out.println("======================================");
			String[] split = str.split("e");
			for (String string2 : split) {
				System.out.println(string2);
				
			}
		}*/
		final int NUM=10000;
		String string="hello";
		//StringBuilder sb=new StringBuilder("hello");
		StringBuffer sb=new StringBuffer("hello");
		long start1 = System.currentTimeMillis();
		for(int i =0;i<NUM;i++){
			string+=i;
		}
		long end1 = System.currentTimeMillis();
		System.out.println("123"+(end1-start1));
		long start2 = System.currentTimeMillis();
		for(int i =0;i<NUM;i++){
			string+=i;
		}
	long end2 = System.currentTimeMillis();
	System.out.println("456"+(end2-start2));
	
	
	
	String str = sb.toString();
	
	long start3 = System.currentTimeMillis();
	str.split(",");
	long end3 = System.currentTimeMillis();
	System.out.println("789"+(end3-start3));
	
	
	long start4 = System.currentTimeMillis();
	getStringArr(str);
	long end4 = System.currentTimeMillis();
	System.out.println("66:66"+(end4-start4));
	
	String[] stringArr=getStringArr(str);
	}
	
	//自定义方法分割字符串
	public static String[] getStringArr(String str){
		//创建一个集合存储分割后的字符串0
		ArrayList<String> strs = new ArrayList<String>();
		int len=-1;
		//利用，分割字符串后，添加到集合中
		while((len=str.indexOf(","))!=-1){
			strs.add(str.substring(0, len));
			str=str.substring(len+1);
		}
		//注意：最后的字符串要添加进集合中
		strs.add(str);
		//不能直接使用toArray()方法

		return strs.toArray(new String[strs.size()]);
	}


}
