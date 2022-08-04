package com.globallogic.helloworld;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(-34);
		ls.add(-35);
		ls.add(356);
		ls.add(456);
		ls.add(4);
		System.out.println(ls);
		Stream<Integer> st=ls.stream();
		// It will iterate and provide the object each time.
		//st.forEach(e->System.out.print(e));
		//st.forEach(obj->System.out.println(obj));
//		for(Object obj:ls)
//		{
//			System.out.println((Integer)obj);
//		}
		
		
		//ls.stream().forEach(obj->System.out.println(obj));
		//ls.stream().filter(e->e>0).forEach(System.out::println);
//		for(Integer e:ls)
//		{
//			if(e>0) {
//				return e;
//			}
//		}
		List<Integer> PN=ls.stream().filter(e->e>0).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		//System.out.println(PN);
		ls.stream().filter(e->e>0).map(e->e+" hello").sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		//PN.stream().sorted().forEach(e->System.out.println(e));
	Integer sum=ls.stream().mapToInt(Integer::intValue).sum();
	System.out.println(sum);
	}

}
