package com.capgemini.coursesmanagementsystem.service;

import com.capgemini.coursesmanagementsystem.entity.Course;
import com.capgemini.coursesmanagementsystem.entity.Student;
import com.capgemini.coursesmanagementsystem.entity.dto.StudentDTO;
import com.capgemini.coursesmanagementsystem.mapper.StudentMapper;
import com.capgemini.coursesmanagementsystem.repository.CourseRepository;
import com.capgemini.coursesmanagementsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
//    private final Student student;
//    private final Course course;

    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
//        this.student = student;
//        this.course = course;
    }

    public StudentDTO addStudent(StudentDTO studentDTO) {
        Student newStudent = studentRepository.save(StudentMapper.toEntity(studentDTO));
        return StudentMapper.toDTO(newStudent);
    }

    public StudentDTO getStudentById(Integer studentId) {
        Student foundStudent = studentRepository.getById(studentId);
        return StudentMapper.toDTO(foundStudent);
    }

    public void enrollStudent(Integer studentId, Integer courseId) {
        Course course = new Course();
        Student student = new Student();

        if (studentRepository.findById(studentId).isPresent() && courseRepository.findById(courseId).isPresent()) {
            student = studentRepository.findById(studentId).get();
            course = courseRepository.findById(courseId).get();
        }

        student.getCourses().add(course);
        course.getStudents().add(student);
    }
}
