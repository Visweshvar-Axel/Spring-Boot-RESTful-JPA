package com.msqljpa.JPAWeb.controller;

import com.msqljpa.JPAWeb.Service.StudentService;
import com.msqljpa.JPAWeb.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;
    ResponseEntity<?> responseEntity;
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents(){
        List<Student> res = studentService.getAll();
        responseEntity = new ResponseEntity<List<Student>>(res, HttpStatus.ACCEPTED);
        return responseEntity;
    }
    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.add(student),HttpStatus.CREATED);
    }
    @DeleteMapping("/students/{id}")
    public boolean deleteStudents(@PathVariable long id){
        return studentService.deleteById(id);
    }

}
