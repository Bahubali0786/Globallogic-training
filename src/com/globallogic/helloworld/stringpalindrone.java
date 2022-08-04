package com.globallogic.helloworld;
import java.util.*;
public class stringpalindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String p="";
		
		for(int i=0;i<s.length();i++)
		{
			p=s.charAt(i)+p;
		}
		int i=0;
		if(i==s.compareTo(p))
			System.out.println("Palindrome");
		System.out.println(p);
		

	}

}
