package com.capgemini.coursesmanagementsystem.mapper;

import com.capgemini.coursesmanagementsystem.entity.Course;
import com.capgemini.coursesmanagementsystem.entity.Student;
import com.capgemini.coursesmanagementsystem.entity.dto.CourseDTO;
import com.capgemini.coursesmanagementsystem.entity.dto.StudentDTO;

public class StudentMapper {
    public static StudentDTO toDTO (Student student){
        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setStudentId(student.getStudentId());
        studentDTO.setFirstName(student.getLastName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setYearOfStudy(student.getYearOfStudy());


        return studentDTO;
    }


    public static Student toEntity(StudentDTO studentDTO){
        Student student = new Student();

        student.setStudentId(studentDTO.getStudentId());
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setYearOfStudy(studentDTO.getYearOfStudy());
        student.setCnp(studentDTO.getCnp());


        return student;
    }
}
