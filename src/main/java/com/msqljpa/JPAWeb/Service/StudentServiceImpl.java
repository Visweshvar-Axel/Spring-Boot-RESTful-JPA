package com.msqljpa.JPAWeb.Service;

import com.msqljpa.JPAWeb.entity.Student;
import com.msqljpa.JPAWeb.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public Student add(Student student) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
