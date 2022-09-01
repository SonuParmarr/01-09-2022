package com.oops.bll;

public class EMPLOYEE {
	private static final String "Emloyeefirstname: = null;
	private int id;
	private String firstname;
	private String lastname;
	private double salary;
	
	EMPLOYEE(){
	}
	EMPLOYEE(int id, String firstname, String lastname, double salary){
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public double getAnnualsalary(){
		return salary*12;
	}
public float getraisesalary(float percent) {
	return (float) (salary*12+(salary*12*(percent/100F));
}
public String toString( ) {
	return "+ Employee id :"+id "Emloyeename:+"+firstname "+lastname :+" lastname" != salary :"+salary";
}
}
