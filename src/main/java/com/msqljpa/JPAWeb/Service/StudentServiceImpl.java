package com.msqljpa.JPAWeb.Service;

import com.msqljpa.JPAWeb.entity.Student;
import com.msqljpa.JPAWeb.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student add(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public boolean deleteById(Long id) {
        if (studentRepo.findById(id).isPresent())
        studentRepo.deleteById(id);
        else return false;
        return true;
    }
}
