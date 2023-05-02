package com.springrest.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studId;
	
	private String fName;
	
	private String lName;
	
	private String email;
	
	private String password;
	
	
	@OneToOne( mappedBy="student" ,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonManagedReference
	private Course course;


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Student(int studId, String fName, String lName, String email, String password, Course course) {
		super();
		this.studId = studId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.course = course;
	}


	public Student() {
		super();
	}


	@Override
	public String toString() {
		return "Student [studId=" + studId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", password=" + password + ", course=" + course + "]";
	}
	
	
	

	
	
}
