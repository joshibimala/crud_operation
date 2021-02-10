package com.example.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "crudtable")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentid;
    @Column(name="s_name")
    private String name;
    @Column(name="s_course")
    private String course;

    public int getId() {
        return studentid;
    }

    public void setId(int id) {
        this.studentid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
