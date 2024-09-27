package com.project.my_project.service;

import com.project.my_project.dto.StudentRequest;
import com.project.my_project.entity.Student;
import com.project.my_project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository =studentRepository;
    }

    //memanggil kelas repo ke kelas ini cara 2
//    @Autowired
//    private  StudentRepository studentRepository;

    @Override
    public String save(StudentRequest request){
        saveToDB(request);
        return "Success";
    }

    @Override
    public String get(Long id) {
        Optional<Student> student = studentRepository.findById(id);

        if(student.isPresent()){
            return "Success";
        } else {
            return "Data not found";
        }
    }

    private void saveToDB(StudentRequest request){
        Student student = new Student();

        student.setName(request.getName());
        student.setDob(request.getDob());

        studentRepository.save(student);
    }
}
