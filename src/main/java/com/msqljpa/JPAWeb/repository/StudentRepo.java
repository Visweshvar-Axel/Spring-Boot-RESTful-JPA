package com.msqljpa.JPAWeb.repository;

import com.msqljpa.JPAWeb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
