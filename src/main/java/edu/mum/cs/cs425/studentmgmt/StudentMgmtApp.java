package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ClassRoomRepository;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private ClassRoomRepository classRepo;

	public static void main(String[] args) {
		SpringApplication.run(StudentMgmtApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1 = new Student(00061001L,"Anna","Lynn","Smith",3.45,LocalDate.of(2019, 5, 24));
		Transcript t1 = new Transcript("BS ComputerScience");
		Classroom cl1 = new Classroom("McLaughin","M105");
		s1.setTranscript(t1);
		s1.setClassRoom(cl1);
		cl1.addStudent(s1);
		
		Classroom savedClassRoom = saveClassRoom(cl1);
		Student savedStudent = saveStudent(s1);
		System.out.println(savedStudent);
		System.out.println(savedClassRoom);
		
	}
	
	public Student saveStudent(Student s) {
		return studentRepo.save(s);
	}
	
	public Classroom saveClassRoom(Classroom cl) {
		return classRepo.save(cl);
	}
	

}
