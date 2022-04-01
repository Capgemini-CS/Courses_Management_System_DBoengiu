package com.capgemini.coursesmanagementsystem.entity.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class StudentDTO {


    private Integer studentId;
    private String firstName;
    private String lastName;
    private Integer yearOfStudy;
    private String cnp;
}
