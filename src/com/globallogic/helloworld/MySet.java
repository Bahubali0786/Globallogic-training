package com.globallogic.helloworld;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	public static void main(String[] args) {
		List<Integer> td=new ArrayList<Integer>();
		td.add(4);
		td.add(43);
		td.add(434);
		td.add(43);
		Set<Integer> td1=new HashSet<Integer>();
		 System.out.println("List "+td);
		 td1.add(4);
			td1.add(43);
			td1.add(434);
			td1.add(43);
		 System.out.println("Set "+td1);
		 Set<Integer> td2=new TreeSet<Integer>();//Collections.reverseOrder()
		 //System.out.println("List "+td);
		 td2.add(4);
			td2.add(43);
			td2.add(434);
			td2.add(43);
			System.out.println(td2);
//			Set<Integer> td3=new LinkedSet<Integer>();
//			 //System.out.println("List "+td);
//			 td3.add(4);
//				td3.add(43);
//				td3.add(434);
//				td3.add(43);
//				System.out.println(td3);
	}

}
