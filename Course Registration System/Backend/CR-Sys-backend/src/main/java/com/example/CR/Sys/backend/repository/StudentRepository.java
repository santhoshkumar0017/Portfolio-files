package com.example.CR.Sys.backend.repository;


import com.example.CR.Sys.backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
