package com.globallogic.helloworld;
import java.util.*;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MyTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new TreeMap<String,Integer>();
		map.put("erendra", 1);
		map.put("zara", 34);
		map.put("bnkit",2);
		map.put("Aman", 56);
		
//		System.out.println(map.containsKey(1));
//		map.containsValue("erendra");
//		Set<String> key=map.keySet();
//		for(String str: key)
//		{
//			System.out.println("keys "+str);
//			System.out.println(map.get(str));
//		}
		System.out.println(map);
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
		System.out.println("Key "+entry.getKey()+" value ");
		}
		

	}

}
