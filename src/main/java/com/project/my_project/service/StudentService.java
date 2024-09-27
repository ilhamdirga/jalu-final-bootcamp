package com.project.my_project.service;

import com.project.my_project.dto.StudentRequest;

public interface StudentService {


    String save(StudentRequest request);

    String get(Long id);

}
