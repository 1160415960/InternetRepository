package com.ibeifeng.mystring;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("��Ʒ1");
		stack.push("��Ʒ2");
		stack.push("��Ʒ3");
		stack.push("��Ʒ4");
		
		
		/*for (String string : stack) {
			System.out.println(string);
		}*/
		System.out.println("����鿴����ƷΪ");
		int len=stack.size();
		for(int i=0;i<len;i++){
			System.out.println(stack.pop());
		}
	}
}
