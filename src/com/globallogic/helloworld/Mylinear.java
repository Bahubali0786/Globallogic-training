package com.globallogic.helloworld;
import java.util.*;
public class Mylinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter the size");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be find");
		int f=sc.nextInt();
		int t=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]==f)
			{
				t=1;
			}
		}
		if(t==1)
			System.out.println("True");
		else
			System.out.println("False");
		

	}

}
