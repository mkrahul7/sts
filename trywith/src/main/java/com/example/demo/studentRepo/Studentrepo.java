package com.example.demo.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.student.Student;

public interface Studentrepo extends JpaRepository<Student, Long> {

}
