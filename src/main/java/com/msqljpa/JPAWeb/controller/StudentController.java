package com.msqljpa.JPAWeb.controller;

import com.msqljpa.JPAWeb.Service.StudentService;
import com.msqljpa.JPAWeb.Service.StudentServiceImpl;
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
    private StudentServiceImpl studentService;
    ResponseEntity<?> responseEntity;
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents(){
        List<Student> res = studentService.getAll();
        responseEntity = new ResponseEntity<List<Student>>(res, HttpStatus.ACCEPTED);
        return responseEntity;
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable long id){
        return responseEntity;
    }
    @DeleteMapping("/students/{id}")
    public ResponseEntity<?> deleteStudents(@PathVariable long id){
        return responseEntity;
    }

}
