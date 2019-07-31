package edu.mum.cs.cs425.studentmgmt.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Table(name = "students")
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	@NonNull
	private long studentNumber;
	@NonNull
	private String firstName;
	private String middleName;
	@NonNull
	private String lastName;
	private Double cgpa;
	private LocalDate dateOfEnrollment;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long studentNumber, String firstName, String middleName, String lastName, Double cgpa,
			LocalDate dateOfEnrollment) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}
	public Student(long studentNumber, String firstName, String lastName, LocalDate dateOfEnrollment) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfEnrollment = dateOfEnrollment;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", dateOfEnrollment="
				+ dateOfEnrollment + "]";
	}
	
	
	
	
}
