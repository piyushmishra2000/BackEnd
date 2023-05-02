package com.springrest.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.CourseRepo.CourseRepo;
import com.springrest.ResourceNotFoundException.ResourceNotFoundException;
import com.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;

	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	public ResponseEntity<Course> getCourseById(int id) {
		Course course = courseRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student with this id not found" + id));
		return ResponseEntity.ok(course);

	}

	public Course createCourse(Course course) {

		return courseRepo.save(course);
	}

	public ResponseEntity<Course> updateCourseById(int id, Course course) {
		Course course1 = courseRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not exist with id :" + id));

		course1.setTitle(course.getTitle());
		course1.setDescription(course.getDescription());
		Course Updatedcourse = courseRepo.save(course1);
		return ResponseEntity.ok(Updatedcourse);
	}

	public ResponseEntity<Map<String, Boolean>> deleteCourseById(int id) {
		Course course = courseRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student with this id not found" + id));
		courseRepo.deleteById(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Employee deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);

	}

}
