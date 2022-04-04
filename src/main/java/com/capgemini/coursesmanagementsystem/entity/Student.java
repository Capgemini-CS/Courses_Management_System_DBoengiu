package com.capgemini.coursesmanagementsystem.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;
    private Integer yearOfStudy;

    @Column(nullable = false, unique = true, length = 13)
    private String cnp;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "student_courses",
            joinColumns = { @JoinColumn(name = "students_id") },
            inverseJoinColumns = { @JoinColumn(name = "courses_id") })
    private Set<Course> courses = new HashSet<>();


    public void enrollInCourse(Course course) {
        courses.add(course);
    }

}
