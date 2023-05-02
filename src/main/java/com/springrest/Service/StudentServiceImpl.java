package com.springrest.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.CourseRepo.StudentRepo;
import com.springrest.ResourceNotFoundException.ResourceNotFoundException;
import com.springrest.entities.Student;
@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public ResponseEntity<Student> getStudentById(int id) {
		Student student = studentRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student with this id not found" + id));
		return ResponseEntity.ok(student);

	}

	@Override
	public Student createstudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public ResponseEntity<Student> updateStudentById(int id, Student student) {
		
		Student student1 = studentRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student with this id not exist "+id));
		
		student1.setEmail(student.getEmail());
		student1.setfName(student.getfName());
		student1.setlName(student.getlName());
		student1.setPassword(student.getPassword());
		
		Student updatedStudent = studentRepo.save(student);
		return ResponseEntity.ok(updatedStudent);
	}

	@Override
	public ResponseEntity<Map<String, Boolean>> deleteStudentById(int id) {
		Student student = studentRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("student with this id does not exist"+id));
		studentRepo.deleteById(id);
		Map<String, Boolean>response =new HashMap<>();		
		response.put("Student is Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
