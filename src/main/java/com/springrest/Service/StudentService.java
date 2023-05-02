package com.springrest.Service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.entities.Student;
@Service
public interface StudentService {
	
	List<Student> getAllStudent();
	
	ResponseEntity<Student> getStudentById(int id);
	
	Student createstudent(Student student);
	
	ResponseEntity<Student> updateStudentById(int id, Student student);
	
	ResponseEntity<Map<String, Boolean>> deleteStudentById(int id);
	
	
	

}
