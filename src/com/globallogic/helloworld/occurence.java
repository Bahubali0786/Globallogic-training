package com.globallogic.helloworld;
import java.util.*;
public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		int so=s.indexOf(c);
		int sl=s.lastIndexOf(c);
		System.out.println("starting "+so+" last "+sl);

	}

}
