package com.msqljpa.JPAWeb.Service;

import com.msqljpa.JPAWeb.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student add(Student student);
    boolean deleteById(Long id);
}
