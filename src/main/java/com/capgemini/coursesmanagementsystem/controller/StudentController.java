package com.capgemini.coursesmanagementsystem.controller;

import com.capgemini.coursesmanagementsystem.entity.dto.CourseDTO;
import com.capgemini.coursesmanagementsystem.entity.dto.StudentDTO;
import com.capgemini.coursesmanagementsystem.service.CourseService;
import com.capgemini.coursesmanagementsystem.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable Integer id) {
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }

    @PostMapping("{student_id}/course/{course_id}")
    public void enrollStudent(@PathVariable("student_id") Integer studentId, @PathVariable("course_id") Integer courseId) {
        studentService.enrollStudent(studentId, courseId);
    }
}
