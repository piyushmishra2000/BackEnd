package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.Service.CourseService;
import com.springrest.entities.Course;

@RestController
@RequestMapping("/piyush")
public class MyController {

	@Autowired
	private CourseService courseService;

	//GET All
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getAllCourse();
	}

	//GET By Id
	@GetMapping("/{id}")
	public ResponseEntity<Course> getStudentById(@PathVariable int id) {
		return courseService.getCourseById(id);
	}

	//Post All
	@PostMapping
	public Course createCourse(@RequestBody Course course) {
		return courseService.createCourse(course);
	}

	//Update
	@PutMapping("/{id}")
	public ResponseEntity<Course> updateCourseById(@PathVariable ("id") int id, @RequestBody Course course) {
		return courseService.updateCourseById(id, course);

	}

	//Delete
	@DeleteMapping("/{id}")
	public String deleteCoursetById(@PathVariable int id) {
		courseService.deleteCourseById(id);
		return ("Course Deleted Successfully");
	}
	
	

}
