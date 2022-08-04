package com.globallogic.helloworld;
import java.util.*;
public class Umbrella {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char a=sc.next().charAt(0);
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(a==s.charAt(i)) {
				j=1;
			}
		}
		if(j==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("not found");
		}

	}

}
