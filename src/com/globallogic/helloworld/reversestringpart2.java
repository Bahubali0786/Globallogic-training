package com.globallogic.helloworld;
import java.util.*;
public class reversestringpart2 {

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
			for(int j=0;j<ww.length();j++)
			{
				sw=ww.charAt(j)+sw;
			}
			sr=sr+sw+" ";
		}
		System.out.println(sr);

	}

}
