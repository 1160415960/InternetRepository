package com.ibeifeng.mystring;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("商品1");
		stack.push("商品2");
		stack.push("商品3");
		stack.push("商品4");
		
		
		/*for (String string : stack) {
			System.out.println(string);
		}*/
		System.out.println("最近查看的商品为");
		int len=stack.size();
		for(int i=0;i<len;i++){
			System.out.println(stack.pop());
		}
	}
}
