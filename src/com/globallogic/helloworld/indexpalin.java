package com.globallogic.helloworld;

import java.util.Scanner;
import java.util.*;
public class indexpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		//System.out.println("Enter the string");
		String w[]=s.split(" ");
		String sr="";
		for(int i=0;i<w.length;i++)
		{
			String ww=w[i];
			String sw="";
			String rr="";
			for(int j=0;j<ww.length();j++)
			{
				sw=ww.charAt(j)+sw;
				rr=rr+"*";
				System.out.println(rr);
			}
			if(ww!=" "&&sw.equalsIgnoreCase(ww)) {
				System.out.print("t");
				sr=sr+rr;
			}
			else 
			{
				sr=sr+ww+" ";
			}
		}
		
		System.out.println(sr);


	}

}
