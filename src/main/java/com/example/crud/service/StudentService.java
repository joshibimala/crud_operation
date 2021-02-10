package com.example.crud.service;

import com.example.crud.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public Student getStudentById(int studentid);
    public void saveStudent(Student student);
    public void deleteStudent(int studentid);
    public void updateStudent(Student student);
}
