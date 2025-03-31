package com.psr.loggers.dto;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private double salary;
	
	
	public Student() {

	}


	public Student(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	  @Override public String toString() { return "Student [id=" + id + ", name=" +
	  name + ", salary=" + salary + "]"; }
	 
	

	
	public static void main(String[] args) {
		
		
		Student s1=new Student(1,"kk",2000);
		Student s2=new Student(2,"ram",3000);
		Student s3=new Student(3,"san",1000);
		Student s4=new Student(2,"kartik",15000);
		Student s5=new Student(5,"kartik",1000);
		Student s6=new Student(6,"kartik",1500);
		Student s7=new Student(7,"raju",20000);
		Student s8=new Student(3,"mani",1000);
		
		
		List<Student> slist=new LinkedList<>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);
		slist.add(s6);
		slist.add(s7);
		slist.add(s8);
		
		
		System.out.println("before");
		for(Student s:slist) {
			
			System.out.println(s);
		}
		
		Collections.sort(slist);
	
		
		System.out.println("After");
for(Student s:slist) {
			
			System.out.println(s);
		}
		
		
		
	}


	@Override
	public int compareTo(Student o) {
		
		int x=this.name.compareTo(o.getName());
		
		if(x==0) {
			
			if(this.id>o.getId())
			{
				return -1;
			}
			if(this.id<o.getId())
			{
				return 1;
			}
			return 0;
		}
				
		return -x;		
				//compareTo(o.getName());
		
		
		/*
		 * if(this.name.compareTo(o.getName()))) { return 1; } else
		 * if(this.name.equals(getName())) { return -1; }
		 * 
		 * return 0;
		 */
	}
	
	
	
	

}
