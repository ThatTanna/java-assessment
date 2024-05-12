package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {
    CourseService courseService;
    Course course = new Course("TEST-COURSE", "Test Course", 6, new Module("TEST-MODULE", "Test Module", "Description"));

    @BeforeEach
    void setUp(){
        courseService = new CourseService();
    }

    @Test
    void registerCourse() {

        courseService.registerCourse(course);

        assertNotNull(courseService.getCourse("TEST-COURSE"));
        assertEquals(course, courseService.getCourse("TEST-COURSE"));

    }

    @Test
    void getCourse() {
        assertNull(courseService.getCourse("TEST-COURSE-2"));
    }
}