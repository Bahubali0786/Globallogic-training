package com.globallogic.helloworld;
import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.*;
import java.util.function.Supplier;

public class Myconsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.List<Integer> ls=new ArrayList<Integer>();
		//List<Integer>
		ls.add(423);
		ls.add(2524);
		ls.add(324);
		
		
		Consumer<Integer> PC=s->System.out.println(s);
		
		//ls.forEach(PC);
		Consumer<List<Integer>> sqrt=list->{
			for(int i=0;i<ls.size();i++)
			{
				ls.set(i,ls.get(i)*ls.get(i));
			}
		};
		//Consumer<List<Integer>> PCL=list->ls.stream().forEach(PC);
		//sqrt.andThen(PCL).accept(ls);
		
		
		
		Supplier<Integer> supplier=new Supplier<Integer>() {
			public Integer get() {
				return new Random().nextInt();
			}
		};
		
		//System.out.println(supplier.get());
		
		Predicate<Integer> Pr=new Predicate<Integer>() {
			public boolean test(Integer num) {
			if(num>0) {
				return true;
			}
			else
				return false;
		}
		};
		ls.stream().filter(Pr).forEach(PC);
		
		
		
		
		
		
		
		
		
	}

}
