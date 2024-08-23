package com.msqljpa.JPAWeb.controller;

import com.msqljpa.JPAWeb.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    ResponseEntity<?> responseEntity;
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents(){
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
