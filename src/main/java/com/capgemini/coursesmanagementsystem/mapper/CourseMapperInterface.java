package com.capgemini.coursesmanagementsystem.mapper;


import com.capgemini.coursesmanagementsystem.entity.Course;
import com.capgemini.coursesmanagementsystem.entity.dto.CourseDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")

public interface CourseMapperInterface {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCourseFromDto(CourseDTO dto, @MappingTarget Course entity);
}
