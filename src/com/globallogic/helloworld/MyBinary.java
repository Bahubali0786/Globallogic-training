package com.globallogic.helloworld;
import java.util.*;
public class MyBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		System.out.println("Enter the array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int f=0;
		int la=n-1;
		int mid=(f+la)/2;
		System.out.println();
		int key=sc.nextInt();
		 while( f <= la){  
		      if ( arr[mid] < key ){  
		        f = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element found");  
		        break;  
		      }else{  
		         la = mid - 1;  
		      }  
		      mid = (f + la)/2;  
		   }  
		   if ( f > la ){  
		      System.out.println("Element not found!");  
		   }  
		 }  
	}

