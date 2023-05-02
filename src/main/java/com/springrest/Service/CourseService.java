package com.springrest.Service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.entities.Course;
@Service
public interface CourseService {
	
	List<Course> getAllCourse();
	
	ResponseEntity<Course> getCourseById(int id);
	
	Course createCourse( Course course);
	
	ResponseEntity <Course> updateCourseById(int id, Course course);
	
	ResponseEntity <Map <String, Boolean>> deleteCourseById(int id);

}
