package com.globallogic.helloworld;

import java.util.*;
import java.util.Scanner;

import java.util.ArrayList;

public class E12 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		ArrayList<E1> empList = new ArrayList<>();

		int c = 1;

		while (c == 1) {

			System.out.println("---------- Menu!!!!----------");
			System.out.println("1. Add the employee to list ");
			System.out.println("2. Delete the employee from list ");
			System.out.println("3. Search the employee name ");
			System.out.println("4. Update the employee value using name ");
			System.out.println("5. Sort the data of employee ");
			System.out.println("6. Provide the sum of salary of employee ");
			System.out.println("7. Search for highest paid salary ");
			System.out.println("8. Search for minimum paid salary ");
			System.out.println("9. See the list ");

			int ch;
			System.out.println("Enter your choice");
			ch = sc.nextInt();

			switch (ch) {

			case 1:

				System.out.println("Enter employee id:");
				int id = sc.nextInt();

				System.out.println("Enter employee salary");
				int salary = sc.nextInt();

				System.out.println("Enter employee name");
				String name = sc.next();

				E1 emp = new E1(id, name, salary);

				empList.add(emp);
				System.out.println("Data added successfully");
				System.out.println(empList);
				break;

			case 2:
				System.out.println("Enter the name of employee to be deleted");
				String ame = sc.next();
				boolean flag = false;
				int a = 0;
				for (E1 e : empList) {
					if (e.getName().equalsIgnoreCase(ame)) {
						flag = true;
						break;
					} else {
						a++;
					}
				}
				if (flag) {
					empList.remove(a);
					System.out.println("Data deleted successfully!!!");
				} else {
					System.out.println("No such employee exists");
				}
				break;

			case 3:
//				System.out.println("Enter the name of employee to be searched");
				String empName = sc.next();

				boolean fag = false;
				for (E1 e : empList) {
					if (e.getName().equalsIgnoreCase(empName)) {
						fag = true;
						break;
					}
				}
				if (fag) {
					System.out.println("Employee Found!!!");
				} else {
					System.out.println("No such employee exists");
				}

				break;

			case 4: {
				System.out.println("Enter the name of employee to be updated whose id and salary is to be updated");
				String empNam = sc.next();
				System.out.println("Enter the updated id:");
				int id1 = sc.nextInt();
				System.out.println("Enter the updated salary:");
				int sal = sc.nextInt();
				for (E1 e : empList) {
					if (e.getName().equalsIgnoreCase(empNam)) {
						e.setId(id1);
						e.setSalary(sal);
						System.out.println("Employee Data updated");

					}
				}
				break;
			}

			case 5:
				Collections.sort(empList, new SortBy());
				System.out.println(empList);
				System.out.println("Sorting has been done");
				break;

			case 6:
				double sum = 0;

				for (E1 e : empList) {
					sum = sum + e.getSalary();
				}

				System.out.println("Sum of salary of all employees is " + sum);
				break;

			case 7:

				int maxSal = Integer.MIN_VALUE;

				for (E1 e : empList) {
					if (maxSal < e.getSalary()) {
						maxSal = e.getSalary();
					}
				}
				System.out.println("Highest paid salary is " + maxSal);
				break;

			case 8:
				int minSal = Integer.MAX_VALUE;

				for (E1 e : empList) {
					if (minSal > e.getSalary()) {
						minSal = e.getSalary();
					}
				}
				System.out.println("Minimum paid salary is " + minSal);
				break;

			case 9:
				System.out.println(empList);
				break;

			default:
				System.out.println("Invalid Choice!!!!");

			}

			System.out.println("If u want to come out of menu enter 0 otherwise to continue press 1");

			int a = sc.nextInt();

			if (a == 1) {
				c = 1;
			} else {
				c = 0;
			}

		}

	}

}

class SortBy implements Comparator<E1> {
	public int compare(E1 ee, E1 ef) {
		return ee.getName().compareTo(ef.getName());
	}
}

class E1 {

	private int id;
	private String name;
	private int salary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public E1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
