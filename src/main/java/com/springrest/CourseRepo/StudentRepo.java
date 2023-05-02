package com.springrest.CourseRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.entities.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
