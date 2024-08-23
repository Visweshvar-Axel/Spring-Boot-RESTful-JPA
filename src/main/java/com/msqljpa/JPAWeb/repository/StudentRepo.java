package com.msqljpa.JPAWeb.repository;

import com.msqljpa.JPAWeb.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
//public class StudentRepo {
//    @Autowired
//    EntityManager em;

}
