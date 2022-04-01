package com.capgemini.coursesmanagementsystem.repository;

import com.capgemini.coursesmanagementsystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
