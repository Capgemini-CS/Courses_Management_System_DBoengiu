package com.capgemini.coursesmanagementsystem.service;

import com.capgemini.coursesmanagementsystem.entity.Course;
import com.capgemini.coursesmanagementsystem.entity.dto.CourseDTO;
import com.capgemini.coursesmanagementsystem.mapper.CourseMapper;
import com.capgemini.coursesmanagementsystem.mapper.CourseMapperInterface;
import com.capgemini.coursesmanagementsystem.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;


    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;

    }

    public CourseDTO addCourse(CourseDTO courseDTO) {
        Course newCourse = courseRepository.save(CourseMapper.toEntity(courseDTO));
        return CourseMapper.toDTO(newCourse);
    }

    public CourseDTO updateCourse(CourseDTO payload) {
        CourseDTO courseDTO = null;

        if (courseRepository.findById(payload.getCourseId()).isPresent()) {
            Course savedEntity = courseRepository.save(CourseMapper.toEntity(payload));
            courseDTO = CourseMapper.toDTO(savedEntity);

    }
        return courseDTO;
}
}
