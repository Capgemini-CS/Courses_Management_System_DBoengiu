package com.capgemini.coursesmanagementsystem.service;

import com.capgemini.coursesmanagementsystem.entity.Course;
import com.capgemini.coursesmanagementsystem.entity.Student;
import com.capgemini.coursesmanagementsystem.entity.dto.CourseDTO;
import com.capgemini.coursesmanagementsystem.entity.dto.StudentDTO;
import com.capgemini.coursesmanagementsystem.mapper.CourseMapper;
import com.capgemini.coursesmanagementsystem.mapper.StudentMapper;
import com.capgemini.coursesmanagementsystem.repository.CourseRepository;
import com.capgemini.coursesmanagementsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDTO addStudent(StudentDTO studentDTO) {
        Student newStudent = studentRepository.save(StudentMapper.toEntity(studentDTO));
        return StudentMapper.toDTO(newStudent);
    }
}
