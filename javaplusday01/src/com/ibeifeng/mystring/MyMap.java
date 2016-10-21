package com.ibeifeng.mystring;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();
		
		map.put("1", "wang1");
		map.put("2", "wang2");
		map.put("3", "wang3");
		map.put("4", "wang4");
		
		
		/*Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
		
		/*Set<String> keySet = map.keySet();
		for (String s : keySet) {
			System.out.println(s);
			System.out.println(map.get(s));	
		}*/
		
	}

}
