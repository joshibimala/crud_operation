package com.example.crud.controller;

import java.util.List;
import com.example.crud.model.Student;
import com.example.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    private List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }


    @GetMapping("/student/{studentid}")
    private Student getStudent(@PathVariable("studentid") int studentid){
     return studentService.getStudentById(studentid);
    }

    @PostMapping("/students")
    private void saveStudent(@RequestBody Student student){
      studentService.saveStudent(student);
    }

    @DeleteMapping("/student/{studentid}")
    private void deleteStudent(@PathVariable("studentid") int studentid){
      studentService.deleteStudent(studentid);
    }
    @PutMapping("/students")
    private Student updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);

        return student;
    }

}
