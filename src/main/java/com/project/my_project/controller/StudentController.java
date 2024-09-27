package com.project.my_project.controller;

import com.project.my_project.dto.StudentRequest;
import com.project.my_project.service.StudentService;
import org.springframework.web.bind.annotation.*;


public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) { this.studentService = studentService;}

    @PostMapping("/add")
    public String addStudent(@RequestBody
    StudentRequest request) {
    return studentService.save(request);
    }

    @GetMapping(value = "/get/{id}")
    public String getDataStudentByID(@PathVariable Long id) {
        return studentService.get(id);
    }

}
