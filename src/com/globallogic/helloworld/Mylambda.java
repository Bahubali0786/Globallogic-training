package com.globallogic.helloworld;
import java.util.*;
interface Print
{
	public void s();
}
interface Code 
{
	public int sum(int a, int b);
}

public class Mylambda {

	public static void main(String[] args) {
		// TODO Auto-gene;ated method stub
		int aa=20;
		int bb=89;
		
		Code code=(a,b)->{return a+b;};
		System.out.println(code.sum(aa,bb));
		
		Print p=()->{System.out.println("Print ");};
		//System.out.println(p.s());
		p.s();
	}

}
