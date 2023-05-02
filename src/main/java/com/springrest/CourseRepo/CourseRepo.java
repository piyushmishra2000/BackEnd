package com.springrest.CourseRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{


}
