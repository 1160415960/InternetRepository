package com.ibeifeng.mystring;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyList {

	public static void main(String[] args) {
		String string = "123456789";
		final int NUM=1000000;
		ArrayList<Integer> strArr = new ArrayList<Integer>();
		LinkedList<Integer> strLink = new LinkedList<Integer>();
		
		
		/*long start1 = System.currentTimeMillis();
		for(int i =0;i<NUM;i++){
			strArr.add(i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("ArrayList"+(end1-start1));
		
		long start2 = System.currentTimeMillis();
		for(int i =0;i<NUM;i++){
			strLink.add(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("LinkedList"+(end2-start2));*/
		
		/*long start1 = System.currentTimeMillis();
		for(int i =0;i<NUM;i++){
			strArr.add(0,i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("ArrayList"+(end1-start1));
		
		long start2 = System.currentTimeMillis();
		for(int i =0;i<NUM;i++){
			strLink.add(0,i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("LinkedList"+(end2-start2));*/
		
		long start1 = System.currentTimeMillis();
		for(int i =1000;i<20000;i++){
			strArr.get(i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("ArrayList"+(end1-start1));
		
		long start2 = System.currentTimeMillis();
		for(int i =1000;i<20000;i++){
			strLink.get(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("LinkedList"+(end2-start2));
		
	}
}
