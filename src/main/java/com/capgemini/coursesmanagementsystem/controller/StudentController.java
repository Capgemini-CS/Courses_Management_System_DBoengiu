package com.capgemini.coursesmanagementsystem.controller;

import com.capgemini.coursesmanagementsystem.entity.dto.CourseDTO;
import com.capgemini.coursesmanagementsystem.entity.dto.StudentDTO;
import com.capgemini.coursesmanagementsystem.service.CourseService;
import com.capgemini.coursesmanagementsystem.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/")
    public ResponseEntity<StudentDTO> add(@RequestBody StudentDTO studentDTO) {
        return new ResponseEntity<>(studentService.addStudent(studentDTO), HttpStatus.CREATED);
    }
}
