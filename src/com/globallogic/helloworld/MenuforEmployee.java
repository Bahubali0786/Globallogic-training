//
//Create a List with student class and perform the follwing operation
//1. Add the employee to list
//2. Delete the employee from list
//3. Search the employee name
//4. Update the meployee value using name or name
//5. Sort the data of employee
//
//6. Provide the sum of slary of employee
//7 search for highest paid salary
//8 search for minimum paid salary
//create a manu base program for above probelm

package com.globallogic.helloworld;

import java.util.ArrayList;
import java.util.Scanner;
class Emplo
{
	int id;
	String Name;
	double sal;
	public Emplo(int id, String name, double sal) {
		//super();
		this.id = id;
		Name = name;
		this.sal = sal;
	}
//	String Name;
//	double sal;

}

public class MenuforEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello there1");
		System.out.println("Enter the number according to menu");
		System.out.println("Press 1 for add Employee");
		System.out.println("Press 2 for delete Employee");
		System.out.println("Press 3 for search Employee");
		System.out.println("Press 4 for update Employee");
		System.out.println("Press 5 for sort Employee data");
		System.out.println("Press 6 for sum of salary of Employee");
		System.out.println("Press 7 for highest paid Employee");
		System.out.println("Press 8 for minimum paid Employee");
		System.out.println("Press 9 for printing the full list");
		//int i=sc.nextInt();
		ArrayList<Emplo> E=new ArrayList<Emplo>();
		while(true)
		{
			System.out.println("Enter the your choice: ");
			int i=sc.nextInt();
			switch(i)
			{
				case 1:
				{
					System.out.println("Enter the employee Id");
					int id=sc.nextInt();
					System.out.println("Enter the employee name");
					String name=sc.next();
					System.out.println("Enter the employee Salary");
					Double sal=sc.nextDouble();
					Emplo ob=new Emplo(id,name,sal);
					E.add(ob);
					break;
				}
				case 2:
				{
				System.out.println("Enter the Employee Index");
				String sr=sc.next();
				int a=-1;
				
				for(Emplo str: E)
				{
					
					if((str.Name).equals(sr))
					{
						
						System.out.println("Name found");
					}
				}
				E.remove(a);
				break;
				}
				case 3:
				{
					
					boolean B=E.contains(sc.nextInt());
					System.out.println(B);
				}
				case 9:
				{
					for (Emplo str : E)
					{
						System.out.print("Name -"+str.Name + " ");
						System.out.print("ID- "+str.id+" ");
						System.out.print("Salary- "+str.sal+" ");
						System.out.println();
					}break;
				}
			}
		}
	}
}
