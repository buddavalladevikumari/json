package com.example.demo;

public class Student {
 private int rollnumber;
 private String studentname;
 private int marks;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int rollnumber, String studentname, int marks) {
	super();
	this.rollnumber = rollnumber;
	this.studentname = studentname;
	this.marks = marks;
}
public int getRollnumber() {
	return rollnumber;
}
public void setRollnumber(int rollnumber) {
	this.rollnumber = rollnumber;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
 
}
