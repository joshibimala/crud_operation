package com.example.crud.service.impl;

import com.example.crud.model.Student;
import com.example.crud.repository.StudentRepository;
import com.example.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int studentid) {
        return studentRepository.findById(studentid).get();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int studentid) {
        studentRepository.deleteById(studentid);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

}
