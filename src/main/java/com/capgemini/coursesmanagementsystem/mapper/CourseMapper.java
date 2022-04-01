package com.capgemini.coursesmanagementsystem.mapper;

import com.capgemini.coursesmanagementsystem.entity.Course;
import com.capgemini.coursesmanagementsystem.entity.dto.CourseDTO;
import com.capgemini.coursesmanagementsystem.entity.dto.StudentDTO;

public class CourseMapper {

    public static CourseDTO toDTO (Course course){
        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setCourseId(course.getCourseId());
        courseDTO.setTitle(course.getTitle());
        courseDTO.setNumberOfCredits(course.getNumberOfCredits());

        return courseDTO;
    }


    public static Course toEntity(CourseDTO courseDTO){
        Course course = new Course();

        course.setCourseId(courseDTO.getCourseId());
        course.setTitle(courseDTO.getTitle());
        course.setNumberOfCredits(courseDTO.getNumberOfCredits());


        return course;
    }
}
