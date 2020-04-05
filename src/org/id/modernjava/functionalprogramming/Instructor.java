package org.id.modernjava.functionalprogramming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Instructor {
    String name;
    String title;
    String gender;
    int yearsOfExperience;
    List<String> courses;
    boolean onlineCourses;

    /*public Instructor (String name, String title, String gender, int yearsOfExperience, List<String> courses, boolean onlineCourses) {
        this.name = this.title = title;
        this.gender = gender;
        this.yearsOfExperience = yearsOfExperience;
        this.courses = courses;
        this.onlineCourses = onlineCourses;

    }*/
}
