package com.capgemini.coursesmanagementsystem.repository;

import com.capgemini.coursesmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
