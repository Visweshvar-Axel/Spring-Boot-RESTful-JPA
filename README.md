```java
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
```
```java
package com.msqljpa.JPAWeb.repository;

import com.msqljpa.JPAWeb.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
//public class StudentRepo {
//    @Autowired
//    EntityManager em;

}

```
```java
package com.msqljpa.JPAWeb.Service;

import com.msqljpa.JPAWeb.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student add(Student student);
    boolean deleteById(Long id);
}

```
```java
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

```
```java
package com.msqljpa.JPAWeb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Student() {
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

```