package com.globallogic.helloworld;
import java.util.*;
import java.util.Scanner;

interface sq{
	double squ(double n);
}

public class MyLambdahand2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		sq s=(a)->Math.sqrt(a);
		System.out.println(s.squ(b));

	}

}
