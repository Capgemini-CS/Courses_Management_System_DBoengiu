package com.capgemini.coursesmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "courses")
@DynamicUpdate
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Integer courseId;

    @Column(nullable = false)
    private String title;
    private Integer numberOfCredits;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "courses")
//    @JsonIgnore
    private Set<Student> students = new HashSet<>();

    public void enrollStudent(Student student) {
        students.add(student);
    }


}
