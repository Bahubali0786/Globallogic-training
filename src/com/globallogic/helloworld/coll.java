package com.globallogic.helloworld;
import java.util.*;
import java.io.*;

class Student<W,V,X,Y,Z>
{
	W id;
	V name;
	X sub;
	Y marks;
	Z year;
	public Student(W id,V name,X sub,Y marks,Z year)
	{
		this.id=id;
		this.sub=sub;
		this.name=name;
		this.marks=marks;
		this.year=year;
	}
	public void print()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.sub);
		System.out.println(this.marks);
		System.out.println(this.year);
	}
}
public class coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<String,String,String,String,String> s1=new Student<String,String,String,String,String>("12","phy","ETHAN","20","2001");
		Student<Integer,Integer,Integer,Integer,Integer> s2=new Student<Integer,Integer,Integer,Integer,Integer>(122,12,121,1211,12112);
		//s1.print();
		//s2.print();
		
		
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("AMAN");
		ls.add("ZARA");
		ls.add("Prince");
		//System.out.println(ls);
		//ls.forEach(e->System.out.println(e));
		//ls.forEach(System.out::println);
		//System.out.println(ls.get(0));
		//Collections.sort(ls);
		//System.out.println(ls);
		
		

//		ArrayList<String> ls1=new ArrayList<String>();
//		ls1.add("AMAN");
//		ls1.add("ZARA");
//		ls1.add("Prince");
		//ls1.iterator();
		
//		Iterator<String> it=ls1.iterator();
//		Collections.sort(ls);
//		while(it.hasNext())
//		{
//			//String el=it.next();
//			//System.out.println("element is"+ el);
//			System.out.println(it.next());
//		}
//iterator
		LinkedList<String> ls1=new LinkedList<String>();
		ls1.add("AMAN");
		ls1.add("ZARA");
		ls1.add("Prince");
		ls1.element();
		ls1.poll();
		ls1.pollFirst();
		//Iterator<String> 
	}


}
