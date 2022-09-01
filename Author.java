package com.oops.bll;

public class Author {
	private String firstname;
	private String lastname;
	private String bookname;
	

public Author (String firstname, String lastname){
	this.firstname = firstname;
	this.lastname = lastname;
}
public String getfirstname() {
	return firstname;
}
public String getlastname() {
	return lastname;
}
	
	public Author (String firstname, String lastname, String bookname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.bookname = bookname;
	}
public String getfirstname1(){
	return firstname;
}
public String getlastname1() {
	return lastname;
		
}
public String getbookname( ) {
	return bookname;
	
}
public String toString() {
	return ""+"Author's Name :" +firstname+" "+lastname+" "+"Book Name:"+bookname;
}
	
}

