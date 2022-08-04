package com.globallogic.helloworld;
import java.util.Map;
import java.util.*;
public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new Hashtable<>();
		map.put("Amerendra", 1);
		map.put("Ankit",2);
		map.put("Aman", 56);
		System.out.println(map.containsKey(1));
		map.containsValue("Amerendra");
		Set<String> key=map.keySet();
		for(String str: key)
		{
			System.out.println("keys "+str);
			System.out.println(map.get(str));
		}
		System.out.println(map);
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			System.out.println("Key "+entry.getKey()+" value ");
		}
		

	}

}
