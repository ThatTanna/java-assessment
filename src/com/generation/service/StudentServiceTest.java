package com.generation.service;

import com.generation.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    StudentService studentService;
    Student student = new Student("123", "Tanna", "t@t.com", new Date(10/10/2010));

    @BeforeEach
    void setUp(){
        studentService = new StudentService();
    }

    @Test
    void subscribeStudent() {
        studentService.subscribeStudent(student);
        assertTrue(studentService.isSubscribed("123"));
    }

    @Test
    void isSubscribed() {
        studentService.subscribeStudent(student);
        assertTrue(studentService.isSubscribed("123"));
    }

    @Test
    void isSubscribedNotEquals(){
        assertFalse(studentService.isSubscribed("999"));
    }

    @Test
    void showSummary() {
        studentService.subscribeStudent(student);
        studentService.showSummary();

    }
}