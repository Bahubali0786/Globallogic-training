package com.globallogic.helloworld;
//
//Create a lambda to find the even and odd value
//create a lambda to find the lagrst number
//create a lambda to find the min  number
//create a lambda to print the hello world
//create a lambda to print the sum of 1 to 10 0 number

import java.util.Scanner;

interface Up{
	void u(String s);
}
interface nat{
	public void nature(int n);
}
interface evod {
	public String eve(int a);
}

interface largest {
	public int la(int arr[]);
}

interface Smallest {
	public int sm(int arr[]);
}

interface Hp {
	void p();
}

interface sum {
	public void hun();
}

public class Mylambdahand {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);

		// Ques 1- Create a lambda to find the even and odd value
//		System.out.println("Enter the to checked even or odd ");
//		int n=sc1.nextInt();
//		evod e=(a)->{
//			if(a%2==0)
//				return "TRUE";
//			else
//			{
//				return "FALSE";
//			}
//		};
//		System.out.println(e.eve(n));

		// Ques 2 --create a lambda to find the largest number
//		int arr[]=new int[5];
//		System.out.println("Enter the array");
//		for(int i=0;i<5;i++)
//		{
//			arr[i]=sc1.nextInt();
//		}
//		
//		largest l=(a)->{
//			int i=a[0];
//			for(int b =0;b<5;b++)
//			{
//				if(arr[b]>i)
//					i=arr[b];
//			}
//			return i;
//		};
//		System.out.println("Largest number is " +l.la(arr));

		// Ques 3-- create a lambda to find the min number

//		int arr1[]=new int[5];
//		for(int i=0;i<5;i++)
//		{
//			arr1[i]=sc1.nextInt();
//		}
		
//		Smallest l1=(a)->{
//			int i=a[0];
//			for(int b =0;b<5;b++)
//			{
//				if(a[b]<i)
//					i=a[b];
//			}
//			return i;
//		};
//		System.out.println("Smallest number is"+l1.sm(arr));

		//Ques 4-- create a lambda to print the hello world
		Hp HW=()->{
			System.out.println("hello world");
		};
		HW.p();

		//Ques 5-- create a lambda to print the sum of 1 to 10 0 number
//		sum H = () -> {
//			int i = 0;
//			for (int ii = 0; ii <= 100; ii++) {
//				i = i + ii;
//			}
//			System.out.println("Sum of 1 to 100 is " + i);
//		};
//		H.hun();
//		
//		System.out.println("enter the number to find the nature");
//		int t=sc1.nextInt();
//		nat n1=(d)->{
//			if(t>=0)
//				System.out.println("Positive Number");
//			else
//				System.out.println("Negative Number");
//		};
//		n1.nature(t);
//		System.out.println("Enter the String");
//		String ss=sc1.nextLine();
//		Up upper=(String s)->System.out.println(s.toUpperCase());
//		upper.u(ss);
		
		

	}

}
