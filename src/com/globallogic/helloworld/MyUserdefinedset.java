package com.globallogic.helloworld;

import java.util.Collections;
import java.util.Comparator;
//Create A set with all the implanatation with user defined class employee 
//and perform the insert delete and searching and sorting
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employeeset {
	int id;
	String name;
	double sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Employeeset(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employeeset [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}
class SortBy1 implements Comparator<Employeeset>{
	public int compare(Employeeset ee,Employeeset ef)
	{
		return ee.getName().compareTo(ef.getName());
	}
}
public class MyUserdefinedset {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for add Employee");
		System.out.println("Press 2 for delete Employee");
		System.out.println("Press 3 for search Employee");
		System.out.println("Press 4 for sort Employee data");
		Set<Employeeset> s = new HashSet<Employeeset>();
		while (true) {
			System.out.println("Enter the your choice: ");
			int i = sc.nextInt();
			switch (i) {
			case 1: {
				System.out.println("Enter the employee Id");
				int id = sc.nextInt();
				System.out.println("Enter the employee name");
				String name = sc.next();
				System.out.println("Enter the employee Salary");
				Double sal = sc.nextDouble();
				Employeeset ob = new Employeeset(id, name, sal);
				s.add(ob);

				break;
			}
			case 2: {
				System.out.println("Enter the name to be deleted");
				String name1 = sc.next();
				boolean flag = false;
				for (Employeeset e : s) {
					if (e.getName().equalsIgnoreCase(name1)) {
						flag = true;
						s.remove(e);
					}
				}

				break;
			}

			case 3: {
				System.out.println("Enter the name of employee to be searched");
				String empName = sc.next();

				boolean flag1 = false;
				for (Employeeset e : s) {
					if (e.getName().equalsIgnoreCase(empName)) {
						flag1 = true;
						break;
					}
				}
				if (flag1) {
					System.out.println("Employee Found!!!");
				} else {
					System.out.println("No such employee exists");
				}
				break;
			}
			case 4: {
				//Collections.sort(s, new SortBy1());
				
				System.out.println(s);
				System.out.println("Sorting has been done");
				break;
			}

			case 5: {

				System.out.println(s);
				break;

			}

			}

		}
	}
}
