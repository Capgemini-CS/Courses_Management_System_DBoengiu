package com.capgemini.coursesmanagementsystem.entity.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CourseDTO {

    private Integer courseId;
    private String title;
    private Integer numberOfCredits;

}
