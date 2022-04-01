package com.capgemini.coursesmanagementsystem.controller;

import com.capgemini.coursesmanagementsystem.entity.dto.CourseDTO;
import com.capgemini.coursesmanagementsystem.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/")
    public ResponseEntity<CourseDTO> add(@RequestBody CourseDTO courseDTO) {
        return new ResponseEntity<>(courseService.addCourse(courseDTO), HttpStatus.CREATED);
    }

    @PatchMapping("/")
    public ResponseEntity<CourseDTO> update(@Valid @RequestBody CourseDTO payload) {
        return new ResponseEntity<>(courseService.updateCourse(payload), HttpStatus.I_AM_A_TEAPOT);
    }



    }
