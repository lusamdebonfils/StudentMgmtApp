package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner {
	
	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StudentMgmtApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1 = new Student(00061001L,"Anna","Lynn","Smith",3.45,LocalDate.of(2019, 5, 24));
		Student savedStudent = saveStudent(s1);
		System.out.println(savedStudent);
		
	}
	
	public Student saveStudent(Student s) {
		return repository.save(s);
	}
	
	

}
