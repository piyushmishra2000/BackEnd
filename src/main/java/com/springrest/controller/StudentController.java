package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.Service.StudentService;
import com.springrest.entities.Student;



@RestController
@RequestMapping("/Student")
@CrossOrigin("*")
public class StudentController {
	
   @Autowired	
   private StudentService studentService;
   
   
   
   @GetMapping("/get")
   public List<Student> getAllStudent(){
   		return studentService.getAllStudent();
   }
   
   
   @GetMapping
   public ResponseEntity<Student> getStudentById(@PathVariable int id){
	   return studentService.getStudentById(id);
   }
   
   
   @PostMapping
   public Student createStudent(@RequestBody Student student) {
	   return studentService.createstudent(student);	   
   }
   
   @PutMapping
   public ResponseEntity<Student> updateStudentById(@PathVariable int id, @RequestBody Student student){
	   return studentService.updateStudentById(id, student);
   }
   
   @DeleteMapping
   public String deleteStudentById(@PathVariable int id){
	   studentService.deleteStudentById(id);
	   return ("Student Deleted Succesfully ");
   }  
   
}
