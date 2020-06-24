package com.wipro.Inheritance;
class Employee extends Person{
	private double salary;
	private int year;
	private String insuno;
	public Employee(String n,double a,int y, String i)
	{
		super(n);
		salary=a;
		year=y;
		i=insuno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsuno() {
		return insuno;
	}
	public void setInsuno(String insuno) {
		this.insuno = insuno;
	}
	public String toString()
	{
		return super.toString()+""+salary+""+year+""+insuno;
	}
}