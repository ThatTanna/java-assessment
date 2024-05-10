package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
        extends Person
        implements Evaluation {
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, Date birthDate) {
        super(id, name, email, birthDate);
    }

    public void enrollToCourse(Course course) {
        //TODO implement this method

        // if the approved course is not found in approvedCourses
        // then register the course for the student via calling
        // registerApprovedCourse(...) and storing the course passed in
        if (!approvedCourses.containsKey(course.getCode())) {
            registerApprovedCourse(course);
        }
//        courses.add(course);
    }

    public void registerApprovedCourse(Course course) {
        approvedCourses.put(course.getCode(), course);
    }

    public boolean isCourseApproved(String courseCode) {
        //TODO DONE
        return approvedCourses.containsKey(courseCode);
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses(Course course) {
        //TODO implement this method
        return null;
    }

    public boolean isAttendingCourse(String courseCode) {
        //TODO DONE
        return isCourseApproved(courseCode);
    }

    @Override
    public double getAverage() {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses() {
        //TODO implement this method
        List<Course> courseList = new ArrayList<>();
        approvedCourses.forEach((courseCode, course) -> {
            courseList.add(course);
        });
        return courseList;
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() + "}";
    }
}
